package phonebook;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PhoneBook phone = new PhoneBook();
        phone.addUser("Jade Yuri", "3085873645" + "\n");
        phone.addUser("Draco Macoi", "3059372638" + "\n");
        phone.addUser("Johnny Marco", "3028733028" + "\n");
        System.out.printf(String.valueOf(phone) + "\n");
        System.out.println("================================================================================================");
        System.out.printf(String.valueOf(phone.listAllEntries()) + "\n");
        System.out.println("=================================================================================================");
        System.out.printf(String.valueOf(phone.lookupAUser("Draco Macoi")) + "\n");
        System.out.println("===================================================================================================");
        phone.removeAUser("Johnny Marco");
        System.out.printf(String.valueOf(phone) + "\n");
        System.out.println("===================================================================================================");
        //System.out.printf(String.valueOf(phone.reverseLookupAUser("3028733028")));
    }
}