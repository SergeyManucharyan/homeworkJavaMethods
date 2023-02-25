package inheritsnceandabstractclass.inheritsnce;

public class Child extends Parent{
    @Override
    public void showMessage() {
        System.out.println("Hello Child Class");
        super.showMessage();
    }
}
