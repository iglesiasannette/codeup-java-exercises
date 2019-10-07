
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {


    public static void main(String[] args) {

//
//        System.out.println(addition(3, 2));
//
//        System.out.println(subtraction(5, 7));
//
//        System.out.println(multiplication(7, 5));
//
//        System.out.println(division(10, 2));

//        System.out.println(modulus(10, 2));
////
//            getInteger(1, 10);


          factorial();

//          diceRoll();

//            HighLow(10);

//


//
    }

// 1.     Basic Arithmetic
//
//A.    Create four separate methods. Each will perform an arithmetic operation:
//
//Addition
//Subtraction
//Multiplication
//Division

//B.    Each function needs to take two parameters/arguments so that the operation can be performed.
//
//C.    Test your methods and verify the output.
//
//D.    Add a modulus method that finds the modulus of two numbers.
//
//Food for thought: What happens if we try to divide by zero? What should happen?

    //    public static double addition(double num1, double num2) {
//        return num1 + num2;
//
//    }
//
//    public static double subtraction(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    public static double multiplication(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    public static double division(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static double modulus(double num1, double num2) {
//
//        return num1 % num2;
//    }


//2. Create a method that validates that user input is in a certain range
//
//The method signature should look like this:
//
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!


//    public static int getInteger(int min, int max) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number: ");
//
//        int num = input.nextInt();
//
//        if (num >= min && num <= max) {
//            System.out.println(num + " is a valid number!");
//        } else {
//            System.out.println("That is an invalid number");
//            getInteger(min, max);
//        }
//        return 0;
//
//    }

    // ================== using a loop
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter a number between " + min + " and " + max);
//            // the hasNextInt method will wait for input and check (return true) if valid
//            if (sc.hasNextInt()) {
//                int userNum = sc.nextInt(); // nextInt() can be used here instead of Integer.parseInt(sc.nextLine())
//                if (userNum >= min && userNum <= max) {
//                    return userNum;
//                }
//                System.out.println("Number out of range!");
//            } else {
//                System.out.println("Invalid input!");
//            }
//            sc.nextLine(); // needed to clear scanner of current input
//        }
//    }

    // ================== using recursion
//    public static void getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number between " + min + " and " + max);
//        if (input.hasNextInt()) {
//            int userNum = input.nextInt();
//            if (userNum >= min && userNum <= max) {
//                System.out.println(userNum + " is indeed an integer!");
//
//            } else {
//                System.out.println("Number out of range!");
//                getInteger(min, max);
//            }
//        } else {
//            System.out.println("Invalid input!");
//            getInteger(min, max);
//        }
//        System.out.println("Want to enter another number? [Y/N]");
//        String response = input.nextLine();
//        if (response.equalsIgnoreCase("y")) {
//            getInteger(min, max);
//        }
//        System.out.println("Cool! Take care, homie!");
//
//
//    }

//3. Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:

//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//


    public static void factorial() {
        System.out.print("Enter a number between 1 and 10: ");
        Scanner userInput = new Scanner(System.in);
        int userNumber = Integer.parseInt(userInput.nextLine());
        var result = 1; //as  we are starting at 1
        var middleString = "";
        for (var i = 1; i <= userNumber; i++) {
            result *= i; // i represents the corresponding loop iteration
            middleString += " x "; // first loop is " x 1", then the second loop adds i,
            middleString += "" + i;//so middleString becomes "1 x 2", etc.
            System.out.format("%d! = %s = %d", i, middleString, result);
            System.out.print("Want to roll again? [Y/N]");
            String response = userInput.nextLine();
            if(response.equalsIgnoreCase("y")) {
                factorial();
            }else{
                System.out.println("Cool! Take care, homie!");

            }
        }

    }


//
//    4. Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//    "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//     Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

//
//    public static void diceRoll() {
//        System.out.print("How many sides should each die have? :  ");
//        Scanner userNum = new Scanner(System.in);
//        int diceSides = Integer.parseInt(userNum.nextLine());
//        double randomGen = (int) (Math.random() * (diceSides - 1)) + 1;
//        int random = (int) randomGen; // explicitly casts the math.random from a double to an int, for the first die
//        double randomGen2 = (Math.random() * (diceSides - 1)) + 1;
//        int random2 = (int) randomGen2; //explicitly casts the math.random from a double to an int, for the second die
//        int dice1 = random;
//        int dice2 = random2;
//        System.out.printf("You rolled a %d on the first die, and %d on the second die.\n", dice1, dice2);
//        System.out.print("Want to roll again? [Y/N]");
//        String response = userNum.nextLine();
//        if (response.equalsIgnoreCase("y")) {
//            diceRoll();
//        } else {
//            System.out.println("Cool! Take care, homie!");
//
//        }
//    }

    // *** The java.lang.Math.random() method returns a pseudorandom
    // double type number greater than or equal to 0.0 and less than 1.0.
    // When this method is first called, it creates a single new pseudorandom-number generator,
    //exactly as if by the expression new java.util.Random.

    //EXAMPLE:// Java program to demonstrate working of java.lang.Math.random() method
    //import java.lang.Math;
    //
    //class Gfg2 {
    //driver code//
//    public static void main(String args[])
//    {
//        // define the range
//        int max = 10;
//        int min = 1;
//        int range = max - min + 1;
//
//        // generate random numbers within 1 to 10//
//        for (int i = 0; i < 10; i++) {
//            int rand = (int)(Math.random() * range) + min;
//
//            // Output is different everytime this code is executed
//            System.out.println(rand);
//        }
//    }
//}
    //Output:
    //
    //6
    //8
    //10
    //10
    //5
    //3
    //6
    //10
    //4
    //2

    //5. Game Development 101
    //Welcome to the world of game development!
    //You are going to build a high-low guessing game. Create a class named HighLow inside of src.
    //The specs for the game are:
    //
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"
//
//    public static void HighLow(int num) {
//         int MAX = 10;
//         int MIN = 1;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Pick a number between " + MIN + " and " + MAX);
//
//        Random rand = new Random();
//        int randomGen = rand.nextInt((MAX - MIN) + 1);
//        //Random generator from 1 to 10. The Random class of Java located in the java.util
//        // package has some nextInt() methods that return
//        // an integer.
//        int answer = randomGen;
//
//        System.out.println("Enter your guess: ");
//        int userNum = Integer.parseInt(input.nextLine());
//        boolean win = false;
//
//        while (win == false) {
//            if (userNum < MIN || userNum > MAX)        //if the input is not within the valid range
//            {
//                System.out.println("Enter a number within the valid range of " + MIN + " and " + MAX);
//                userNum = Integer.parseInt(input.nextLine());
//
//            }
//            if (userNum > answer) {        //if input guess is higher than the answer
//                System.out.println("Too high");
//                System.out.println("Enter another guess: ");
//                userNum = Integer.parseInt(input.nextLine());
//            } else {
//                if (userNum < answer)        //if input guess is lower than the answer
//                {
//                    System.out.println("Too low");
//                    System.out.println("Enter another guess: ");
//                    userNum = Integer.parseInt(input.nextLine());
//                } else if (userNum == answer)  {                  //if guess equals to answer
//                    System.out.println("Good Guess!");
//                }
//                win = true;
//                System.out.println(userNum + " is Correct!");
//                System.out.print("Want to roll again? [Y/N]\n");
//                String response = input.nextLine();
//                if (response.equalsIgnoreCase("y")) {
//                    HighLow(num);
//                } else {
//                    System.out.println("Cool! Take care, homie!");
//
//                }
//
//            }
//
//        }
//    }
}











