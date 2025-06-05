package abstractfactory.patterns.aldo;

import abstractfactory.patterns.aldo.factory.ContactFactory;
import abstractfactory.patterns.aldo.factory.FranceContactFactory;
import abstractfactory.patterns.aldo.factory.USContactFactory;
import abstractfactory.patterns.aldo.model.Agenda;

public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        ContactFactory usFactory = new USContactFactory();
        ContactFactory franceFactory = new FranceContactFactory();

        agenda.addContact(usFactory, "123 Main St", "New York", "10001", "212-555-1234");
        agenda.addContact(franceFactory, "10 Rue de Rivoli", "Paris", "75001", "01 44 55 66 77");

        agenda.showAllContacts();
    }
}
