package abstractfactory.patterns.aldo.address;

public class FrenchAddress implements Address{
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public FrenchAddress(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }


    @Override
    public String getAddressDetails() {
        return "French Address: " + street + ", " + city + ", " + state + ", " + zipCode + ", " + country;
    }
}
