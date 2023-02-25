package inheritsnceandabstractclass.aggrigation.employee;

public class Address {
    private int num;
    private  String street;
    private int zip;

    public Address() {
    }

    public Address(int num, String street, int zip) {
        this.num = num;
        this.street = street;
        this.zip = zip;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
