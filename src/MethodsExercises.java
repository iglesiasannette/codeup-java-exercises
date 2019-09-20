import java.lang.Math;
import java.util.Scanner;

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

//          System.out.println(modulus(10, 2));
//
//        getInteger(1, 10);


        factorial(5);

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

//
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
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number between " + min + " and " + max);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Number out of range!");
//                getInteger(min, max);
//            }
//        } else {
//            System.out.println("Invalid input!");
//            getInteger(min, max);
//        }
//        return 0;
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


    public static void factorial(int num) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = input.nextInt();
        var result = 1; //as  we are starting at 1
        var middleString = "";
        for (var i = 1; i <= userInput; i++) {
            result *= i; // i represents the corresponding loop iteration
            middleString += " x "; // first loop is " x 1", then the second loop adds i,
            middleString += "" + i;//so middleString become "1 x 2", etc.
            System.out.format("\n%d! = %s = %d", i, middleString, result);
        }

    }
}








