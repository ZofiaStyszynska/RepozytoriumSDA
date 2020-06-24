package OOP;

public class Address {
    private String country;
    private String city;
    private String street;
    private int homeNo;
    private int flatNo;

    public Address(String country, String city, String street, int homeNo, int flatNo) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }
    public void showAdress(){
        System.out.println("Kraj: " + country+ ", Miasto: "+city + ", ");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }

    public int getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(int flatNo) {
        this.flatNo = flatNo;
    }
}
