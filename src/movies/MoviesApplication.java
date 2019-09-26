//Create a class named MoviesApplication that has a main method.
//Give the user a list of options for viewing all the movies or viewing movies by category.
//Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//If a category is selected, only movies from that category should be displayed.
//Your application should continue to run until the user chooses to exit
package movies;

import util.Input;

public class MoviesApplication {
    static Input input = new Input();
    static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean keepGoing;

        System.err.println("Choose a movie by category: ");
        do {
            System.out.println("0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");

            int userAnswer = input.getInt(0, 5);

            switch (userAnswer) {
                case 0:
                    System.out.println("Later, dude!");
                    break;
                case 1:
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    break;
                case 2:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    break;
                default:
                    System.err.println("Select a valid category");
            }
            System.out.println("Would you like to continue scouring through films?? [Y/N]");
            keepGoing = input.yesNo(); //references the boolean yesNo() method from Input.java
        } while (keepGoing);
        System.out.println("See ya!");
    }
}