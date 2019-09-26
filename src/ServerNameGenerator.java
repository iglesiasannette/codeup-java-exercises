

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
        public static String[] nouns = {
                "Daisy", "Rose", "Iris", "Orchid","Tulip","Sunflower","Carnation","Poppy","Cherry Blossom", "Zinnia",
            };

        public static String[] adj= {
                "Aromatic", "Budding", "Charming", "Chic","Darling","Delicate","Elegant","Enchanting","Striking", "Supple",
        };

        //1A First version in randomization
        public static Random r =  new Random(); ////using the random method from the Random class in java and assigning it to variable r


        //2A second version in randomization that creates a method that allows you to pass in any array and/or arrays as parameters
        public static String randomWords () {
            Random random = new Random();
            int ranNoun = random.nextInt(nouns.length);
            int ranAdj = random.nextInt(adj.length);
            return adj[ranAdj] + " " + nouns[ranNoun];
        }

        public static void main(String[] args)
        {
//             //2A first version in delivering randomization
            int randomNumber=r.nextInt(adj.length); // generates a random index in the adj array
            int randomNumber2=r.nextInt(nouns.length); //generates a random index in the nouns array
            System.out.print("You are as ");
            System.out.print(adj[randomNumber2] + " as a ");
            System.out.println(nouns[randomNumber] + ".");

            //2B second version
//            System.out.print("You are an/a ");
//            System.out.println(randomWords() + ".");


        }

    }

