package abstractfactory.patterns.aldo.phone;

public class FrenchPhoneNumber implements PhoneNumber{

    private String phoneNumber;

    public FrenchPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String getPhoneNumberDetails() {
        return "French Phone Number: " + phoneNumber;
    }
}
