package inheritsnceandabstractclass.aggrigation.seven;

import java.util.ArrayList;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    private String name;
    private ArrayList<Address> address;

    public User(String name, ArrayList<Address> address) {
        this.name = name;
        this.address = address;
    }
    public void info(){
        for (int i = 0; i < address.size(); i++) {
            System.out.println(address.get(i).getCity()+" "+address.get(i).getStreet()+" "+address.get(i).getNum());
        }
    }
}
