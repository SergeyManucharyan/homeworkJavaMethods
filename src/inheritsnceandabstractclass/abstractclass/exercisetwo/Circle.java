package inheritsnceandabstractclass.abstractclass.exercisetwo;

/**
 * Write a program to create a class named Shape which has two abstract
 * methods: draw() and erase(). In this class we have three subclasses Circle, Triangle and Square.
 * Each of them has override version of methods. Create these using polymorphism concepts
 */
public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Circle is  created");
    }

    @Override
    void erase() {
        System.out.println("Circle is erased");
    }
}
