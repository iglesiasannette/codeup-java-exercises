
//  Create a command line grocery list maker...
//    - create a class of GroceryListItem that has properties for name, quantity, and category
//    - for each new item, the user should be prompted to enter in the name, quantity, and category of the grocery list item
//    - create a seperate class GroceryListMaker with a main method to run the app
//    - a static property on the GroceryListMaker class should hold an array of the most up to date list of grocery list items
//    - give the user the choice to print out all items, add a new item, or exit

import util.Input;

public class GroceryListItem {



        public String name;
        public int quantity;
        public String category;


        //constructor
        public GroceryListItem(){
            Input thisInput = new Input();
            System.out.println("What is the name of the item you are wishing to purchase?");
            name = thisInput.getString();
            System.out.println("How many would you like to buy?");
            quantity = thisInput.getInt();
            System.out.println("What category would you place this item??");
            category = thisInput.getString();
        }


}
