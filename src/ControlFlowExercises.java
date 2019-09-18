
//
import java.sql.SQLOutput;
import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // After each exercise, commit your changes, then replace
        // your code in the main method with the next exercise.

        //1.Loop Basics
        //
        //A. While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;


        //B. Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.


//            int i = 0;
//
//             do {
//                 System.out.println(i);
//                  i+=2;
//             }while(i <= 100);


        //Alter your loop to count backwards by 5's from 100 to -10.
//            int i = 100;
//
//            do {
//                System.out.println(i);
//                i-=5;
//             }while(i >= -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each
        // line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
////
//        long i = 2;
//
//            do {
//                System.out.println(i);
//                i*=i;
//             }while(i < 10000000);


        //C. For
        //
        //Refactor the previous two exercises to use a for loop instead.

        ///Original
//        int i = 100;
//
//            do {
//                System.out.println(i);
//                i-=5;
//             }while(i >= -10);
        //refactored

        ///Refactored
//        int i;
//
//        for(i=100; i>=-10; i -=5){
//            System.out.println(i);
//        }

        //original
//        long i = 2;
//
//            do {
//                System.out.println(i);
//                i*=i;
//             }while(i < 10000000);

        //Refactored


//        for(long i=2; i <= 1000000; i *=2){
//            System.out.println(i);
//        }

        //2.Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is
        // the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping
        // and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.

//        int i = 1;
//
//        while (i <= 100) {
//            System.out.println(i);
//            i++;
//        }


        //For multiples of three: print “Fizz” instead of the number.
//        for(byte i = 0;i <= 100;i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println("i = " + i);
//            }
//
//        }


        //For the multiples of five: print “Buzz”.
//        for(byte i = 0;i <= 100;i++){
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println("i = " + i);
//            }
//
//        }


        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (byte i = 0; i <= 100; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i > 100) {
//                break;
//            }
//            System.out.println("i = " + i);
//
//        }

        ////////Combo

//        for(byte i = 0;i <= 100;i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("i = " + i + ": FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("i = " + i + ": Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("i = " + i + ": Fizz");
//            }
//            else{
//                System.out.println("i = " + i);
//            }
//        }
        //#. Display a table of powers.
        //
        //Prompt the user to enter an integer.
//        System.out.println("Enter an integer: ");
//        int aNumber = Integer.parseInt(input.nextLine());
//        //Display a table of squares and cubes from 1 to the value entered.
//
//        int i = 1;
//
//        while (i > aNumber){
//            i*=i;
//            System.out.println(i);
//
//        }

        ///beginning is going to be true as to begin the loop
//        String yesNo = "Y";
//
//        while (yesNo.equalsIgnoreCase("y")) {
//            System.out.println("Enter an Integer: ");
//            int userInput = Integer.parseInt(input.nextLine());
//
//            System.out.println("Number" + " | " + "Squared" + " | " + "Cubed");
//            System.out.println("======" + " |  " + "======" + " | " + "======");
//
//            for (int i = 1; i <= userInput; i++) {
//
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "      " + numberCubed;
//
//                System.out.println(message);
//            }
//
//            System.out.println("would you like to test another number? Y/N");
//
//            yesNo = input.nextLine();
//        }
//        System.out.println("Ok, have a good day");

        ///4. Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0



        //version 1
//        do {
//            System.out.println("What is your grade?");
//            int grade = Integer.parseInt(input.nextLine());
//
//            if (grade <= 100 && grade >= 88) {
//                System.out.println("You have a letter grade of A");
//            } else if (grade <= 87 && grade >= 80) {
//                System.out.println("Your letter grade is a B");
//
//            } else if (grade <= 79 && grade >= 67) {
//                System.out.println("Your letter grade is a C");
//
//            } else if (grade <= 66 && grade >= 60) {
//                System.out.println("You have a letter grade of D");
//            } else if (grade < 59) {
//                System.out.println("You have an F");
//            }
//            System.out.println("Would you like to continue?");
//        } while (input.nextLine().equalsIgnoreCase("y"));
//        System.out.println("Ok, have a good day");


        ///version two
        do {
            System.out.println("Give me a grade number:");
            int grade = Integer.parseInt(input.nextLine());

            String gradeLetter = "";
            if (grade <= 100 && grade >= 88) {
                gradeLetter = "A";
            } else if (grade <= 87 && grade >= 80) {
                gradeLetter = "B";
            } else if (grade <= 79 && grade >= 67) {
                gradeLetter = "C";
            } else if (grade <= 66 && grade >= 60) {
                gradeLetter = "D";
            } else if (grade <= 59 && grade >= 0) {
                gradeLetter = "F";
            }

            System.out.println(gradeLetter);
            System.out.println("Would you like to test another grade Y/N");

        }while(input.nextLine().equalsIgnoreCase("y"));


    }
}



