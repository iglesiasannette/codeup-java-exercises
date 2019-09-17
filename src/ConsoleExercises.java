
import java.util.Scanner;


public class ConsoleExercises {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            double pi = 3.14159;

            System.out.format("\nThe value of pi is approximately %.2f.\n", pi);

            //1.Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
            System.out.println("Enter an integer:");
            int number = input.nextInt();
            System.out.println("Your number is " + number);
            //What happens if you input something that is not an integer?
            //answer: input mismatch exception

            //2. Prompt a user to enter 3 words, and store each of them in a separate variable.
            // Then, display them back in the console, each on a newline.

            System.out.println("Enter a word:");
            String wordOne = input.nextLine();
            System.out.println("Enter another word:");
            String wordTwo = input.nextLine();
            System.out.println("Enter one more word:");
            String wordThree = input.nextLine();

            System.out.format("Your words were: \n%s, \n%s, \nand %s.\n", wordOne, wordTwo, wordThree);

            //What happens if you enter less than 3 words?
            //What happens if you enter more than 3 words?

            //3. Prompt a user to enter a sentence, then store that sentence
            // in a String variable using the next method. Then, display that sentence back to the user.
//
            System.out.println("\nEnter a sentence:\n");
            String userSentence = input.next();

            System.out.format("Your sentence was: \n%s", userSentence);

            //do you capture all of the words?
            // answer: no, only the first word
            // next() is useful if you want to grab things by spaces

            //4. Rewrite the above example using the nextLine method.
//            System.out.println("\nEnter a sentence:\n");
//            String userSentence = input.nextLine();
//
            System.out.format("Your sentence was: \n%s", userSentence);


            //5. Calculate the perimeter and area of Codeup's classrooms.
            //Prompt the user to enter values of length and width of a classroom at Codeup.
            //Use the nextLine method to get user input and cast the resulting string to a numeric type.
            //Assume that the rooms are perfect rectangles.
            //Assume that the user will enter valid numeric data for length and width.

            System.out.println("\nEnter the length of this classroom in feet:\n");
            int lengthOfRoom = Integer.parseInt(input.nextLine());
            System.out.println("\nEnter the width of this classroom in feet:\n");
            int widthOfRoom = Integer.parseInt(input.nextLine());


           int area = lengthOfRoom * widthOfRoom;
           int perimeter = (2*widthOfRoom) + (2*lengthOfRoom);

            System.out.format("The area of the classroom is %s feet", area);
            System.out.format("The perimeter of the classroom is %s feet", perimeter);




        }

    }

