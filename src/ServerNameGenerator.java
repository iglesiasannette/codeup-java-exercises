

    //Server Name Generator
    //
    //We are going to build a server name generator. Create a class inside of src
    // named ServerNameGenerator, and follow the specs below.
    //
    //Create two arrays whose elements are strings: one with at least 10 adjectives,
    // another with at least 10 nouns.
    //Create a method that will return a random element from an array of strings.
    //Add a main method, and inside of your main method select and random noun and adjective
    // and hyphenate the combination and display the generated name to the user.

import java.util.Random;
    public class ServerNameGenerator {
//

        public static void main(String[] args)
        {
            String[] noun={"Daisy", "Rose", "Iris", "Orchid","Tulip","Sunflower","Carnation","Poppy","Cherry Blossom", "Zinnia",};
            String[] adj={"Aromatic", "Budding", "Charming", "Chic","Darling","Delicate","Elegant","Enchanting","Striking", "Supple",};
            Random r = new Random();
            int randomNumber=r.nextInt(adj.length);
            int randomNumber2=r.nextInt(noun.length);
            System.out.print("You are as ");
            System.out.print(adj[randomNumber2] + " as a ");
            System.out.println(noun[randomNumber] + ".");
        }

    }

