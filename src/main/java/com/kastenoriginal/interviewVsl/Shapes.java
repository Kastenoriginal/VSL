package src.main.java.com.kastenoriginal.interviewVsl;

import src.main.java.com.kastenoriginal.interviewVsl.shapes.Shape;
import src.main.java.com.kastenoriginal.interviewVsl.shapes.ShapeHolder;
import src.main.java.com.kastenoriginal.interviewVsl.shapes.ThreeDimensional;

import java.util.Scanner;

public class Shapes {

    private static Scanner inputReader;

    public static void main(String[] args) {
        init();

        while (true) {
            int shapeNumber = -1;
            while (shapeNumber == -1) {
                shapeNumber = getShapeNumber();
            }

            Shape currentShape = ShapeHolder.getAllShapes().get(shapeNumber);

            boolean areDimensionsCorrect = false;
            while (!areDimensionsCorrect) {
                areDimensionsCorrect = setDimensions(currentShape);
            }

            showResult(currentShape);
        }
    }

    private static void init() {
        inputReader = new Scanner(System.in);
    }

    private static int getShapeNumber() {
        System.out.println("Available shapes:");
        System.out.println();
        for (int i = 0; i < ShapeHolder.getAllShapeNames().size(); i++) {
            System.out.println(i + " - " + ShapeHolder.getAllShapeNames().get(i));
        }
        System.out.println();
        System.out.println("Type \"exit\" to end program.");
        System.out.println("Selected shape: ");

        String input = inputReader.next();

        if (input.toLowerCase().equals("exit")) {
            end();
        }

        if (!isNumeric(input)) {
            System.out.println("Invalid input.");
            return -1;
        }

        int shapeNumber = Integer.parseInt(input);

        if (shapeNumber >= ShapeHolder.getAllShapes().size() || shapeNumber < 0) {
            System.out.println("Unknown shape number.");
            return -1;
        }

        return shapeNumber;
    }

    /**
     * @return true if input is correct, false otherwise
     */
    private static boolean setDimensions(Shape shape) {
        System.out.println(shape.getShapeName() + " needs " + shape.getDimensionsCount() + " dimension(s) to calculate surface area.");

        String[] dimensions = new String[shape.getDimensionsCount()];
        Float[] dimens = new Float[shape.getDimensionsCount()];

        String[] dimensionNames = shape.getDimensionNames();
        for (int i = 0, dimensionNamesLength = dimensionNames.length; i < dimensionNamesLength; i++) {
            String dimensionName = dimensionNames[i];
            System.out.print("Enter " + dimensionName + " in cm: ");
            System.out.println();
            dimensions[i] = inputReader.next();

            if (!isNumeric(dimensions[i])) {
                System.out.println("Invalid input.");
                return false;
            }

            dimens[i] = Float.parseFloat(dimensions[i]);

            if (dimens[i] <= 0) {
                System.out.println("Dimension cannot be zero or negative.");
                return false;
            }
        }

        shape.setDimensions(dimens);
        return true;
    }

    private static void showResult(Shape shape) {
        System.out.print("Your " + shape.getShapeName() + " has " + shape.getDimensions() + " surface: " + shape.getSurface() + "cm^2");
        if (shape instanceof ThreeDimensional) {
            System.out.print(" and volume: " + ((ThreeDimensional) shape).getVolume() + "cm^3");
        }
        System.out.println();
    }

    private static boolean isNumeric(String text) {
        try {
            Double.parseDouble(text);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static void end() {
        inputReader.close();
        System.exit(0);
    }
}
