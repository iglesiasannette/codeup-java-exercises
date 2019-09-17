
//
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
//            System.out.println(i);
//            i++;


            //B. Do While
            //
            //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
            // Follow each number with a new line.


//            int i = 0;
//
//             do {
//                i+=2;
//                 System.out.println(i);
//             }while(i < 100);

        //Alter your loop to count backwards by 5's from 100 to -10.
//            int i = 100;
//
//            do {
//                i-=5;
//                 System.out.println(i);
//             }while(i > -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each
        // line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
//
//        double i = 2;
//        System.out.println(i);
//
//            do {
//                i*=i;
//                 System.out.println(i);
//             }while(i < 10000000);






        //C. For
            //
            //Refactor the previous two exercises to use a for loop instead.


            //2.Fizzbuzz
            //
            //One of the most common interview questions for entry-level programmers is
            // the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping
            // and conditional logic skills.
            //
            //Write a program that prints the numbers from 1 to 100.




//        while(i < 100){
//            i++;
//            System.out.println(i);
//        }


        //For multiples of three: print “Fizz” instead of the number.
//        for(byte i = 0;i <= 100;i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//                continue;
//            } else if (i > 100){
//                break;
//            }
//            System.out.println("i = " + i);
//
//        }

        //For the multiples of five: print “Buzz”.
//        for(byte i = 0;i <= 100;i++){
//            if(i % 5 == 0){
//                System.out.println("Buzz");
//                continue;
//            } else if (i > 100){
//                break;
//            }
//            System.out.println("i = " + i);
//
//        }




        //For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for(byte i = 0;i <= 100;i++){
//            if(i % 3 == 0 || i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            } else if (i > 100){
//                break;
//            }
//            System.out.println("i = " + i);
//
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

        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.
        }
    }

