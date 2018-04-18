package phonebook;

import java.util.HashMap;
import java.util.Iterator;

public class PhoneBook {

    HashMap<String, String> contacts = new HashMap<>();

    public void addUser(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void removeAUser(String name) {
        contacts.remove(name);
    }


    public String lookupAUser(String name) {
        return contacts.get(name);
    }

   //public String reverseLookupAUser(String phoneNumber) {

   //}

    public String listAllEntries() {
        return toString();
    }


    @Override
    public String toString() {
        return "PhoneBook{ " +
                "contacts= " + contacts +
                '}';
    }


}