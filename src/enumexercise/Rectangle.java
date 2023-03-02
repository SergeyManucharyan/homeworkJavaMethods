package enumexercise;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    public void setSide(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * sideA + 2 * sideB;
    }
}
