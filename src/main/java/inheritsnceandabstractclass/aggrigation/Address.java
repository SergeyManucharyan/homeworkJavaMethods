package inheritsnceandabstractclass.aggrigation;

public class Address {
    public int num;
    private  String street;
    private String zip;

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address(int num, String street, String zip) {
        this.num = num;
        this.street = street;
        this.zip = zip;
    }
}
