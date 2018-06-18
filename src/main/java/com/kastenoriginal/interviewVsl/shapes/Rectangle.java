package src.main.java.com.kastenoriginal.interviewVsl.shapes;

public class Rectangle implements Shape {

    private float width;
    private float height;

    @Override
    public String getShapeName() {
        return getClass().getSimpleName();
    }

    @Override
    public int getDimensionsCount() {
        return 2;
    }

    @Override
    public String[] getDimensionNames() {
        return new String[]{"width", "height"};
    }

    @Override
    public void setDimensions(Float[] dimensions) {
        width = dimensions[0];
        height = dimensions[1];
    }

    @Override
    public String getDimensions() {
        return getDimensionNames()[0] + ": " + width + "cm, " + getDimensionNames()[1] + height + "cm,";
    }

    @Override
    public double getSurface() {
        return height * width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
