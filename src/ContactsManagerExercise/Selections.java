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




    //this method souts the users choices
        public static void showMenu() {
            System.out.println("1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n" +
                    "\nEnter an option (1, 2, 3, 4 or 5):\n");
        }


    //if user selects 1
    public static void showContacts() {

            System.out.println("\nHere is your contact list... \n");
            try {
                List<String> contactList; //creating a string called contactList
                Path contactsPath = Paths.get("data", "contacts.txt"); //retrieves the filepath
                contactList = Files.readAllLines(contactsPath);// uses the Files class and readAllLines method of the file and assigns it to the variable contactList
                System.out.println("Name:        |  Phone Number:  |      Email:        |              \n----------------------------------------------------");// prints one time
                for (String contact : contactList) { //for each contact (or line) in the contactList document, print each line
                    System.out.println(contact);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }



    //part 2 of adding contacts
    //this method gather the input from the user, then inputs the parameters in the addContact method, which appends the contact
//    public static void addContactsAction() {
//        //2 add contacts
//
//        Scanner userInput = new Scanner(System.in);
//
//
//        do {
//            System.out.println("Enter your first and last name: ");
//            String name = userInput.nextLine();
//            String[] fullName = name.split(" "); //creates an array of strings, splits the array. so fullName[0] is the firstname and fullName[1] is the lastName
//            System.out.println("Enter your Phone Number: ");
//            String num = userInput.nextLine();
//            System.out.println("Enter your Email: ");
//            String email = userInput.nextLine();
//            try {//the contacts are being added in the following addContact method
//                addContact(fullName[0], fullName[1], num, email);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Incorrect format. Try again.");
//                continue;
//            }
//            System.out.println("adding \"" + name + " " + num + "\"" + email + "to contact list...");
//            System.out.println("User Added! Continuing...");
//            break;
//        } while (true);
//    }



    //Part one of adding contacts
    //this method formats the user info and just creates a list of strings and appends to the contactList
//    public static void addContact(String first, String last, String num, String email) {
//
//        Path dataFile = Paths.get("data", "contacts.txt"); //dataFile equals the variable that holds the filepath
//        String name = first + " " + last;
//        String info = name + " | " + num + " | " + email + " |";
//        List<String> contacts = Arrays.asList(info); //takes the info variable and creates an
//        try {
//            Files.write(dataFile, contacts/*or info.getBytes()*/, StandardOpenOption.APPEND); //write method targets the dataFile and appends the contacts list to it. write method can take in an array of bytes and/or a list of Strings
//        } catch (IOException e) {
//            System.out.println("ERROR");
//            e.printStackTrace();
//        }
//
//    }


//          my condensed version of this method
        public static void addContact()

        {

            Scanner userInput = new Scanner(System.in);


            System.out.println("Enter the first name of the new contact you'd like to add: ");
            String firstName = userInput.nextLine();
            System.out.println("Enter the last name of the new contact you would like to add: ");
            String lastName = userInput.nextLine();
            String fullName = firstName + " " + lastName;
            System.out.println("Enter the phone number of the new contact: ");
            String num = userInput.nextLine();
            System.out.println("Enter the new contact's email address: ");
            String email = userInput.nextLine();
            String newContact = fullName + " | " + num + " | " + email;
            List<String> contacts = Arrays.asList(newContact);
                    try {
                        Path dataFile = Paths.get("data", "contacts.txt");
                        Files.write(dataFile, contacts, StandardOpenOption.APPEND);
                        System.out.println("\nYour new contact has been added! \n");
                        showContacts();

                    } catch (IOException e) {
                        System.out.println("error");
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
                if (line.toLowerCase().contains(search)) { //.contains()
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
                List<String> newList = new ArrayList<>(); //an instance of ArrayList from List
                for (String line : lines) { //this loop prints all the contacts to newList but excludes from printing the contact that was searched for
                    if (!line.toLowerCase().contains(search)) {
                        newList.add(line);
                    }
                    Files.write(Paths.get("data", "contacts.txt"), newList); //the first parameter is the file path, and the second parameter is the variable we
                }
                i = false;
                System.out.println("Contact deleted. Returning to menu...\n");
            } catch (IOException e) {
                System.out.println("Another Error! continuing...");
            }
        } while (i);
    }



}