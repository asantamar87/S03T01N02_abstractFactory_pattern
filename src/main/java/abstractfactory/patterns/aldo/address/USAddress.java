package abstractfactory.patterns.aldo.address;

public class USAddress implements Address{
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public USAddress(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }
    @Override
    public String getAddressDetails() {
        return "US Address: " + street + ", " + city + ", " + state + ", " + zipCode + ", " + country;
    }
}
