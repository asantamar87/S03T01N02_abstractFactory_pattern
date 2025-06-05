package abstractfactory.patterns.aldo.factory;

import abstractfactory.patterns.aldo.address.Address;
import abstractfactory.patterns.aldo.address.FrenchAddress;
import abstractfactory.patterns.aldo.phone.FrenchPhoneNumber;
import abstractfactory.patterns.aldo.phone.PhoneNumber;

public class FranceContactFactory implements ContactFactory{
    @Override
    public Address createAddress(String street, String city, String state, String zipCode, String country) {
        return new FrenchAddress(street, city, state, zipCode, country);
    }

    @Override
    public PhoneNumber createPhoneNumber(String countryCode, String areaCode, String number) {
        return new FrenchPhoneNumber (countryCode + " " + areaCode + " " + number);
    }
}
