package inheritsnceandabstractclass.inheritsnce.one;

import inheritsnceandabstractclass.inheritsnce.one.Parent;

public class Child extends Parent {
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("Hello Child Class");
    }
}
