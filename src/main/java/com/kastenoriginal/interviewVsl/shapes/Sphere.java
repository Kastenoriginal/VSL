package src.main.java.com.kastenoriginal.interviewVsl.shapes;

public class Sphere implements Shape, ThreeDimensional {

    private static final double PI = Math.PI;
    private float radius;

    @Override
    public String getShapeName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getDimensionsCount() {
        return 1;
    }

    @Override
    public String[] getDimensionNames() {
        return new String[]{"radius"};
    }

    @Override
    public void setDimensions(Float[] dimensions) {
        radius = dimensions[0];
    }

    @Override
    public String getDimensions() {
        return getDimensionNames()[0] + ": " + radius + "cm,";
    }

    @Override
    public double getSurface() {
        return 4 * PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4 * PI * radius * radius * radius) / 3;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
