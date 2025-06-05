package abstractfactory.patterns.aldo.model;

import abstractfactory.patterns.aldo.address.Address;
import abstractfactory.patterns.aldo.factory.ContactFactory;
import abstractfactory.patterns.aldo.phone.PhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(ContactFactory factory, String street, String city, String postalCode, String phone) {
        Address address = factory.createAddress(street, city, "", postalCode, ""); // Assuming state is not needed for this example
        PhoneNumber phoneNumber = factory.createPhoneNumber("", "", phone); // Assuming country code and area code are not needed for this example
        contacts.add(new Contact(address, phoneNumber));
    }

    public void showAllContacts() {
        for (Contact contact : contacts) {
            contact.display();
            System.out.println("------");
        }
    }

}
