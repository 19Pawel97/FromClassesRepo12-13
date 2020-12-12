package exercises3sda;

public class Triangle implements GetArea {
    private double height;
    private double baseline;

    public Triangle(double height, double baseline) {
        this.height = height;
        this.baseline = baseline;
    }


    @Override
    public double getArea() {
        return 0.5 * height * baseline;
    }
}
