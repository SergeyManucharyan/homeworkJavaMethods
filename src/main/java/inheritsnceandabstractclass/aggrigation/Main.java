package inheritsnceandabstractclass.aggrigation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(4,"Hrachya Qochar","001");
            Employee employee = new Employee(11,"Gevorg",address);
        System.out.println(employee);
    }
}
