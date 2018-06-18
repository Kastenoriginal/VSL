package src.main.java.com.kastenoriginal.interviewVsl.shapes;

public interface Shape {

    String getShapeName();

    int getDimensionsCount();

    String[] getDimensionNames();

    void setDimensions(Float[] dimensions);

    String getDimensions();

    double getSurface();
}
