package ContactsManagerExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



//Contacts manager exercise
//
//The application should be able to:
//
//Show all your contacts //public void showContacts(){}
//Add a new contact// public void addContact(){}
//Search a contact by her name// public void searchContact(){}, use “.contains"
//Delete an existing contact// public void deleteContact(){}

public class Selections extends Input{



        public static void showMenu() {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "Enter an option (1, 2, 3, 4 or 5):");
        }


    //if user selects 1
    public static void showContacts() {

            System.out.println("Displaying your contacts... \n");
            try {
                List<String> contactList;
                Path contactsPath = Paths.get("data", "contacts.txt");
                contactList = Files.readAllLines(contactsPath);
                System.out.println("Name:        |  Phone Number:  |      Email:        |              \n----------------------------------------------------");
                for (String contact : contactList) {
                    System.out.println(contact);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }


    //if user selects 2


    public static void addContactsAction() {
        //#2 add contacts

        Scanner userInput = new Scanner(System.in);
//

        do {
            System.out.println("Enter your first and last name: ");
            String name = userInput.nextLine();
            String[] fullName = name.split(" ");
            System.out.println("Enter your Phone Number: ");
            String num = userInput.nextLine();
            System.out.println("Enter your Email: ");
            String email = userInput.nextLine();
            try {
                addContact(fullName[0], fullName[1], num, email);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect format. Try again.");
                continue;
            }
            System.out.println("adding \"" + name + " " + num + "\"" + email + "to contact list...");
            System.out.println("User Added! Continuing...");
            break;
        } while (true);
    }

    public static void addContact(String first, String last, String num, String email) {
        //#2a Add contacts
        Path dataFile = Paths.get("data", "contacts.txt");
        String name = first + " " + last;
        String info = name + " | " + num + " | " + email + " |";
        List<String> contacts = Arrays.asList(info);
        try {
            Files.write(dataFile, contacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }

    }




    //if user selects 3
    public static void searchContacts() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Let's search your contact list\n");
        System.out.println("Enter name: ");
        String search = userInput.nextLine().toLowerCase();
        try {
            List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
            for (String line : lines) {
                if (line.toLowerCase().contains(search)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Another Error! continuing...");
        }
    }

    public static void deleteContacts() {
        // if user selects 4
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name to delete: ");
        String search = userInput.nextLine().toLowerCase();
        boolean i = true;
        do {
            try {
                List<String> lines = Files.readAllLines(Paths.get("data", "contacts.txt"));
                List<String> newList = new ArrayList<>();
                for (String line : lines) {
                    if (!line.toLowerCase().contains(search)) {
                        newList.add(line);
                    }
                    Files.write(Paths.get("data", "contacts.txt"), newList);
                }
                i = false;
                System.out.println("Contact deleted. Returning to menu...");
            } catch (IOException e) {
                System.out.println("Another Error! continuing...");
            }
        } while (i);
    }



}