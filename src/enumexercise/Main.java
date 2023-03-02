package enumexercise;

import enumexercise.data.*;

public class Main {
    public static void main(String[] args) {
        Planets p = Planets.EARTH;
        System.out.println(p.getName() + " " + p.getYearLength());
        System.out.println("....................");
        for (Planets planet : Planets.values()) {
            System.out.println(planet.getName() + " " + planet.getYearLength());
        }
        System.out.println("....................");
        WeekDays w = WeekDays.MONDAY;
        System.out.println(w.getName() + " " + WeekDays.numOfDay(w));
        System.out.println("....................");
        Shapes s = Shapes.TRIANGLE;
        System.out.println("Area of " + s.name() + " " + s.area(5.2, 3.1, 3.3));
        System.out.println("....................");
        SolarSystem sol = SolarSystem.VENUS;
        System.out.println(sol.name() + " " + sol.distance());
        System.out.println("....................");
        Unit unit = Unit.CELSIUS;
        Unit u = Unit.NEWTON;
        System.out.println(unit.getBaseUnit());
        System.out.println(u.getBaseUnit());
        System.out.println("....................");
        ShapeType rectangleShape = ShapeType.RECTANGLE;
        Rectangle rectangle = (Rectangle) rectangleShape.getShape();
        rectangle.setSide(10, 12);
        System.out.println(rectangleShape + " area " + rectangle.getArea());
        System.out.println(rectangleShape + " perimeter " + rectangle.getPerimeter());
        System.out.println(".....................");
        ShapeType squareShape = ShapeType.SQUARE;
        Square square = (Square) squareShape.getShape();
        square.setSide(32.5);
        System.out.println(squareShape + " area " + square.getArea());
        System.out.println(squareShape + " perimeter " + square.getPerimeter());
        System.out.println(".....................");
        ShapeType circleShape = ShapeType.CIRCLE;
        Circle circle = (Circle) circleShape.getShape();
        circle.setRadius(12.5);
        System.out.println(circleShape + " area " + circle.getArea());
        System.out.println(circleShape + " perimeter " + circle.getPerimeter());
    }
}
