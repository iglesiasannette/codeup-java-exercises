

//  Create a command line grocery list maker...
//    - create a class of GroceryListItem that has properties for name, quantity, and category
//    - for each new item, the user should be prompted to enter in the name, quantity, and category of the grocery list item
//    - create a seperate class GroceryListMaker with a main method to run the app
//    - a static property on the GroceryListMaker class should hold an array of the most up to date list of grocery list items
//    - give the user the choice to print out all items, add a new item, or exit

import util.Input; //for the getInt method


public class GroceryListMaker {

    public static GroceryListItem[] groceryList = new GroceryListItem[0];

    public static void main(String[] args) {

        Input userInput = new Input();
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.println("What would you like to do?\n1: Print out all of your items\n2: Add a new item\n3: Exit");
            int userSelection = userInput.getInt(1, 3);
            if (userSelection == 1) {
                if(groceryList.length == 0){
                    System.out.println("Sorry. There is nothing on the list.");
                } else {
                    System.out.println("=======================================================");
                    for (GroceryListItem item : groceryList) {
                        System.out.format("%-15s | %4d | %15s\n", item.name, item.quantity, item.category);
                    }
                    System.out.println("=======================================================");
                }
            } else if (userSelection == 2) {
                GroceryListItem newItem = new GroceryListItem(); // calling on the GroceryListItem constructor to creatw new instance
                groceryList = addItem(groceryList, newItem);
                System.out.println("Your item has been added.");
            } else if (userSelection == 3) {
                return;
            }

            System.out.println("Keep going? Y/N");
            keepGoing = userInput.yesNo();

        }

        System.out.println("Take care!");

    }

    public static GroceryListItem[] addItem(GroceryListItem[] previousList, GroceryListItem newItem){
        int newListLength = previousList.length + 1; // assigns the number of indexes of the old grocerylist + 1 more to newListLength
        GroceryListItem[] newList = new GroceryListItem[newListLength]; //a new instance that is an array of the GroceryListItem class with 1 more index

        for(int i = 0; i < previousList.length; i++){
            newList[i] = previousList[i]; //newList then equates to the previousList variable for an updated comparison while iterating through the for-loop of addItem
        }

        newList[previousList.length] = newItem; //adds the new item to the very last index
        return newList;

    }

}