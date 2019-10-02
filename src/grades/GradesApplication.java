package grades;

import grades.Student;

import java.util.Scanner;
import java.util.HashMap;


//    2. Create a map for students and GitHub usernames
//
//    Create a class named GradesApplication with a main method. Inside the main method,
//    create a HashMap named students. It should have keys that are strings that represent
//    github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//    Be creative! Make up GitHub usernames and grades for your student objects.

//   3. Create the command line interface
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would
// like to see more information about. The user should enter a GitHub username (i.e. one of the keys
// in your map). If the given input does not match up with a key in your map, tell the user that no
// users with that username were found. If the given username does exist, display information about
// that student, including their name and their grades.
//
//After the information is displayed, the application should ask the user if they want to continue,
// and keep running so long as the answer is yes.


public class GradesApplication {
    static HashMap<String, Student> students;
    // creating a new instance of a collection ,from the Student class, called students.
    //the String parameter is the username we are going to be assigning, and Student is the data type of the new object.


    private static void init() {

        students = new HashMap<String, Student>(); //redundant but there for my reference

        //new Student objects, from the Student class, that are in our new HashMap called students
        Student annette = new Student("Annette");
        annette.addGrade(90); // addGrade method from the Student class
        annette.addGrade(85);
        annette.addGrade(40);

        annette.recordAttendance( "2019-10-01", "A");
        annette.recordAttendance( "2019-10-02", "P");
        annette.recordAttendance( "2019-10-03", "A");
        annette.recordAttendance( "2019-10-04", "P");


        Student bridget = new Student("Bridget");
        bridget.addGrade(90);
        bridget.addGrade(70);
        bridget.addGrade(60);

        bridget.recordAttendance( "2019-10-01", "A");
        bridget.recordAttendance( "2019-10-02", "P");
        bridget.recordAttendance( "2019-10-03", "A");
        bridget.recordAttendance( "2019-10-04", "P");


        Student bev = new Student("Bev");
        bev.addGrade(97);
        bev.addGrade(96);
        bev.addGrade(95);

        bev.recordAttendance( "2019-10-01", "A");
        bev.recordAttendance( "2019-10-02", "P");
        bev.recordAttendance( "2019-10-03", "A");
        bev.recordAttendance( "2019-10-04", "P");


        Student glo = new Student("Glo");
        glo.addGrade(94);
        glo.addGrade(93);
        glo.addGrade(92);

        glo.recordAttendance( "2019-10-01", "A");
        glo.recordAttendance( "2019-10-02", "P");
        glo.recordAttendance( "2019-10-03", "A");
        glo.recordAttendance( "2019-10-04", "P");


        // sets the usernames as keys
        // and values that are student objects
        students.put("bmills", bridget);
        students.put("annette1", annette);
        students.put("bevvybev", bev);
        students.put("thegloUp", glo);

    }

    // enhanced-for loop that iterates through the hashmap and prints the key (which is the username,
    // in this case) out to the console

    public static void userDisplay() {

        String nameList = " | ";
        for (String username : students.keySet()) {
            nameList += " " + username + " | ";


        }
        System.out.println(nameList);
//                   System.out.println(students.get(nameList).getGrades());

    }


//        String array[] = new String[arrlist.size()];


    ///Print the list of GitHub usernames out to the console, and ask the user which student they would
    //// like to see more information about. The user should enter a GitHub username (i.e. one of the keys
    //// in your map). If the given input does not match up with a key in your map, tell the user that no
    //// users with that username were found. If the given username does exist, display information about
    //// that student, including their name and their grades


    public static void userSelection (String key) {
        // compare userInput with usernames
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s\n", students.get(key).getName(), key);
            System.out.printf("Current Average: %.2f\n", students.get(key).getGradeAverage());
            System.out.printf("All grades: %s \n", students.get(key).getGrades().toString());
            students.get(key).attendancePercentage();
            //System.out.printf("Student grades are: %s", students.get(key).addGrade());
            // output student record
        } else {
            System.out.printf("Sorry, no student found with the github username of \"%s\".%n", key);
        }
    }




    public static void main (String[] args){
        Scanner userInput = new Scanner (System.in);


        init();
        System.out.println("Hello there! Here is a list of our users: \n");
        userDisplay();
        boolean keepGoing;

        do {
            System.out.println("\nWhich student would you like to see more information about? (Enter a Github username) : \n");
            String userChoice = userInput.nextLine();
            userSelection(userChoice);


            System.out.println("\nWould you like to see more about another student? \n");
            String userContinue = userInput.nextLine();

            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")){
                keepGoing = true;
            } else {
                System.out.println("Okay, bye!");
                keepGoing = false;
            }

        } while (keepGoing);



    }

}
