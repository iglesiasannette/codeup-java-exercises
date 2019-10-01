
package grades;

import java.util.ArrayList;
import java.util.Map; //added for the bonus
import java.util.HashMap;//added for the bonus


//1. Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers. The student class should have a constructor
// that sets name property, and initializes the grades property as an empty ArrayList. The Student class
// should have the following methods:
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();

public class Student {

    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance = new HashMap<>(); //for attendance bonus


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += this.grades.get(i);
////        for (Integer grade : this.grades) {
//            total += grade;
        }
        return Math.round(total / this.grades.size());
    }


    //Add an attendance property to your Student objects. It should be a HashMap. The keys should be strings
    // representing the date, in the format "2017-10-02", and the values should be Strings that are one of:
    //
    //"A": Absent
    //"P": Present
    //
    //Add a method named recordAttendance(String date, String value) that adds records to the
    // HashMap this method should make sure value is an an acceptable string.

    public void recordAttendance(String date, String value) {
        if (value.equalsIgnoreCase("a")) {
            this.attendance.putIfAbsent(date, "A");
        } else if (value.equalsIgnoreCase("p")) {
            this.attendance.putIfAbsent(date, "P");
        } else {
            System.out.println("Student can only be \"A\"bsent or \"P\"resent...");
        }
    }

    //Create an instance method on your Student class to calculate a student's attendance percentage --
    // (Total Days - Absences) / Total Days.
    // Test your Student class by adding a main method and creating Student objects.
    // Verify that you can add grades to each object, and that your getGradeAverage method correctly
    // returns the average of the student's grades.

    public void attendancePercentage() {
        ArrayList<String> absences = new ArrayList<>();
        for (String date : attendance.keySet()) {
            if (attendance.get(date).equalsIgnoreCase("A")) {
                absences.add(date);
            }
        }
        double average = (double) (attendance.size() - absences.size()) / attendance.size();
        average *= 100;
        System.out.printf("%nDays absent: %d" + "%nAttendance percentage: %.2f %n", absences.size(), average);
    }

}


//    public static void main(String[] args) {
//        Student annette = new Student("Annette");
//        annette.addGrade(90);
//        annette.addGrade(85);
//        annette.addGrade(40);
//        System.out.println(annette.getGradeAverage());
//    }



