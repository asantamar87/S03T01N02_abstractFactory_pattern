package abstractfactory.patterns.aldo.factory;

import abstractfactory.patterns.aldo.address.Address;
import abstractfactory.patterns.aldo.phone.PhoneNumber;

public interface ContactFactory {

    Address createAddress(String street, String city, String state, String zipCode, String country);
    PhoneNumber createPhoneNumber(String countryCode, String areaCode, String number);


}
