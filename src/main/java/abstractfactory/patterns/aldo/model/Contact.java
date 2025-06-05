package abstractfactory.patterns.aldo.model;

import abstractfactory.patterns.aldo.address.Address;
import abstractfactory.patterns.aldo.phone.PhoneNumber;

public class Contact {

    private Address address;
    private PhoneNumber phone;

    public Contact(Address address, PhoneNumber phone) {
        this.address = address;
        this.phone = phone;
    }

    public void display() {
        System.out.println("Address: " + address.getAddressDetails());
        System.out.println("Phone: " + phone.getPhoneNumberDetails());
    }
}
