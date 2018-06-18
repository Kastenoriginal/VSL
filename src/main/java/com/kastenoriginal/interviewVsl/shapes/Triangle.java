package src.main.java.com.kastenoriginal.interviewVsl.shapes;

public class Triangle implements Shape {

    private float base;
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
        return new String[]{"base", "height"};
    }

    @Override
    public void setDimensions(Float[] dimensions) {
        base = dimensions[0];
        height = dimensions[1];
    }

    @Override
    public String getDimensions() {
        return getDimensionNames()[0] + ": " + base + "cm, " + getDimensionNames()[1] + " " + height + "cm,";
    }

    @Override
    public double getSurface() {
        return (base * height) / 2;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
