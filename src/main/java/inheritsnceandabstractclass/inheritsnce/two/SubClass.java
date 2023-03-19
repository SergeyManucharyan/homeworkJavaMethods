package inheritsnceandabstractclass.inheritsnce.two;

public class SubClass extends SuperClass {
    public void printMessage(){
        System.out.println(message);
        System.out.println(super.message);
    }
    private String message="Hello SubClass Class";
}
