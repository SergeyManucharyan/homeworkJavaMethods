package enumexercise;

public class Square extends Shape{
    private  double sideA;

    public void setSide(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getArea() {
        return sideA*sideA;
    }

    @Override
    public double getPerimeter() {
        return 4*sideA;
    }
}
