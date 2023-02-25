package inheritsnceandabstractclass.inheritsnce;

public class Main {
    public static void main(String[] args) {
        Parent child=new Child();
        child.showMessage();
        System.out.println("...............................");
        SubClass subClass=new SubClass();
        subClass.printMessage();
        Truck truck=new Truck(1,"petr0l",2);
        truck.show();
    }
}
