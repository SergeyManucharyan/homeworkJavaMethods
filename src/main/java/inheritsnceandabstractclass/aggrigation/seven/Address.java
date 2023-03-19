package inheritsnceandabstractclass.aggrigation.seven;

public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private String street;
    private int num;

    public Address(String city, String street, int num) {
        this.city = city;
        this.street = street;
        this.num = num;
    }
}
