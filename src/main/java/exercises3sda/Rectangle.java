package exercises3sda;

public class Rectangle implements GetArea {
    private double height;
    private double width;

    public Rectangle (double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double getArea() {
        return height * width;
    }
}
