
import java.util.Scanner;



public class JavaStringBonuses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( nearHundred(92));
//        int x = 5;
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

        //================================= JAVA STRING BONUSES
        //
        //----BONUS 1
        //
        //Create date format converter application.
        //Take in the following format:
        //
        //MM/DD/YYYY
        //
        //Output the following:
        //
        //MonthName DD, YYYY
        //
        //Example:
        //
        //input - 12/01/1999
        //output - December 12, 1999


//        System.out.println("Enter a date MM/DD/YYYY");
//
//        String dateInput = input.nextLine().trim();
//
//        String[] arrOfStr = dateInput.split("/", 3); // Split at each slash into an array of 3 substrings
//
//        String month = arrOfStr[0];
//        String day = arrOfStr[1];
//        String year = arrOfStr[2];
//
//        switch(month){
//            case "01" :
//                month = "January";
//                break;
//            case "02" :
//                month = "February";
//                break;
//            case "03" :
//                month = "March";
//                break;
//            case "04" :
//                month = "April";
//                break;
//            case "05" :
//                month = "May";
//                break;
//            case "06" :
//                month = "June";
//                break;
//            case "07" :
//                month = "July";
//                break;
//            case "08" :
//                month = "August";
//                break;
//            case "09" :
//                month = "September";
//                break;
//            case "10" :
//                month = "October";
//                break;
//            case "11" :
//                month = "November";
//                break;
//            case "12" :
//                month = "December";
//                break;
//        }
//
//
//        String output = month + " " + day + ", " + year;
//        System.out.println(output);


////
//        ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants

//
        System.out.println("Enter a Sentence:");
        String userInput = input.nextLine();

        String sentence = "";

        if(userInput.endsWith(".")){
            sentence = userInput.substring(0, userInput.length()-1); //Returns the substring starting from the specified index, 0, all the way to the end
        } else{
            sentence = userInput;
        }

        int vowelCount = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
                vowelCount++;
            }
        }
//
//
        int totalVowels = vowelCount;
        int totalConsonants = (sentence.replaceAll("\\s","").length()) - vowelCount; // "\\s" replaces all occurrences of white space

        String output = totalVowels + " vowels and " + totalConsonants + " consonants";

        System.out.println(output);


//----BONUS 3

//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!
//
//
//        double num1, num2;
//
//        System.out.print("Enter first number:");
//
//        /*We are using data type double so that user
//         * can enter integer as well as floating point
//         * value
//         */
//        num1 = input.nextDouble();
//        System.out.print("Enter second number:");
//        num2 = input.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /): ");
//        char operator = input.next().charAt(0);
//
//        input.close(); // closes the scanner. does not allow input after scanner is closed
//        double output;
//
//        switch(operator)
//        {
//            case '+':
//                output = num1 + num2;
//                break;
//
//            case '-':
//                output = num1 - num2;
//                break;
//
//            case '*':
//                output = num1 * num2;
//                break;
//
//            case '/':
//                output = num1 / num2;
//                break;
//
//            /* If user enters any other operator or char apart from
//             * +, -, * and /, this display an error message to user
//             *
//             */
//            default:
//                System.out.printf("You have entered wrong operator");
//                return;
//        }
//
//        System.out.println(num1+" "+operator+" "+num2+": "+output);


    }

/*Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.*/

    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) ||
                (Math.abs(200 - n) <= 10));
    }


}











