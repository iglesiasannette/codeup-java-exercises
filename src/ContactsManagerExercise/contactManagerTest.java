package ContactsManagerExercise;


public class contactManagerTest  {

    public static void main(String [] args) {


        Input input = new Input();
        boolean keepGoing = true;

        do {
            Selections.showMenu();

            int userChoice = input.getInt(1, 5);

            switch (userChoice) {
                case 1:
                    Selections.showContacts();
                    break;
                case 2:
                    Selections.addContactsAction();
                    break;
                case 3:
                    Selections.searchContacts();
                    break;
                case 4:
                    Selections.deleteContacts();
                    break;
                case 5:
                    System.out.println("Later!");
                    keepGoing = false;
                    break;
            }
        }   while(keepGoing);
    }
}

