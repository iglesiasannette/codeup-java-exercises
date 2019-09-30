package vowel;
import java.util.Scanner;

public class Vowel {
//    Create a vowel counting method for each vowel in the alphabet (not including y). Each method, when passed a string, should return how many of that vowel is in the string. Given a string, use all of the these vowel counting methods to output the count of each vowel in a word.
//
//    For example:
//
//    countVowels("cat")
//    Should output:
//
//            |======== VOWEL COUNT ========|
//            | A's | E's | I's | O's | U's |
//            | 1   | 0   | 0   | 0   | 0   |
//            |=============================|


    public static String countVowels(String userInput){
        userInput =userInput.toLowerCase();
        int aCount=0;
        int eCount=0;
        int iCount=0;
        int oCount=0;
        int uCount=0;
        for (int i = 0; i < userInput.length(); i++)
        {
            if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'A' ) {
                aCount++;
            }
            if (userInput.charAt(i) == 'e' || userInput.charAt(i) == 'E') {
                eCount++;
            }
            if (userInput.charAt(i) == 'i' || userInput.charAt(i) == 'I' ) {
                iCount++;
            }
            if (userInput.charAt(i) == 'o' || userInput.charAt(i) == 'O') {
                oCount++;
            }
            if (userInput.charAt(i) == 'u' || userInput.charAt(i) == 'U' ) {
                uCount++;
            }
        }
//       System.out.println("|  A's |  E's | I's | O's | U's |");
        return  "the total of each vowel in " + userInput + " is: " +"A = "+ aCount +", E = " + eCount +", I = " + iCount + ", O = " + oCount + ", and U = "+ uCount;
//       System.out.println("|===============================|");


    }


    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        System.out.println(countVowels(userInput));



    }
}