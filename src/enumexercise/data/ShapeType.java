package enumexercise.data;

import enumexercise.Circle;
import enumexercise.Rectangle;
import enumexercise.Shape;
import enumexercise.Square;

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
