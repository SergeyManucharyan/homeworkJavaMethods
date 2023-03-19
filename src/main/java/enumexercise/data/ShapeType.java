package enumexercise.data;

import enumexercise.Circle;
import enumexercise.Rectangle;
import enumexercise.Shape;
import enumexercise.Square;

/**
 * Create an abstract class called Shape that has two abstract methods: getArea() and getPerimeter().
 * Then create an enum called ShapeType that represents different types of shapes, such as CIRCLE, SQUARE, and RECTANGLE.
 * Each enum value should have a reference to a concrete subclass of Shape that implements the getArea() and getPerimeter()
 * methods for that shape.
 */

public enum ShapeType {
    CIRCLE(new Circle()),
    SQUARE(new Square()),
    RECTANGLE(new Rectangle());


    private Shape shape;

    ShapeType(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
