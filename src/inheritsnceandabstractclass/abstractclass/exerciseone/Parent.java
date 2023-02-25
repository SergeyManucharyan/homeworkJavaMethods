package inheritsnceandabstractclass.abstractclass.exerciseone;

/**
 * Create an abstract class 'Parent' with an abstract method
 * message(). It has two subclasses ChildOne & ChildSecond
 * each having override version of  message() method that
 * prints "This is first subclass" and "This is second subclass"
 * respectively. Call the message()  by creating an object for
 * each subclass.
 * Super class
 *
 */
abstract class Parent {
    abstract void message();
}
