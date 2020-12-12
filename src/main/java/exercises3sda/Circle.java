package exercises3sda;

public class Circle implements GetArea{
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
