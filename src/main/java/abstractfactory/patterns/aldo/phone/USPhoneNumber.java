package abstractfactory.patterns.aldo.phone;

public class USPhoneNumber implements PhoneNumber{

    private String phoneNumber;

    public USPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumberDetails() {
        return "US Phone Number: " + phoneNumber;
    }
}
