package inheritsnceandabstractclass.aggrigation.seven;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Yerevan","Abovyan",34);
        Address address1 = new Address("Yerevan","Komitas",12);
        ArrayList<Address> list=new ArrayList<>();
        list.add(address);
        list.add(address1);
        User user=new User("Sergey",list);
        user.info();
    }
}
