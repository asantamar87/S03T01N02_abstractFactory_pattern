package abstractfactory.patterns.aldo.factory;

import abstractfactory.patterns.aldo.address.Address;
import abstractfactory.patterns.aldo.address.USAddress;
import abstractfactory.patterns.aldo.phone.PhoneNumber;
import abstractfactory.patterns.aldo.phone.USPhoneNumber;

public class USContactFactory implements ContactFactory {

    @Override
    public Address createAddress(String street, String city, String state, String zipCode, String country) {
        return new USAddress(street, city, state, zipCode, country);
    }

    @Override
    public PhoneNumber createPhoneNumber(String countryCode, String areaCode, String number) {
        return new USPhoneNumber(countryCode + " " + areaCode + " " + number);
    }
}
