import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    //Create a static method named addPerson. It should accept an array of Person objects,
    // as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.

    private static Person[] addPerson(Person[] people, Person newPeep) {
        Person[] newGroup = Arrays.copyOf(people, people.length + 1);
        newGroup[newGroup.length-1] = newPeep; //
        return newGroup;
    }

    public static void main(String[] args) {

        //Array Basics
        // What happens when you run the following code? Why is Arrays.toString necessary?
        // answer: it is necessary to so as to see a string representation of the array in the console.
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //1. Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person[] peeps = new Person[3];
        peeps[0] = new Person("Nancy");
        peeps[1] = new Person("Tony");
        peeps[2] = new Person("Bob");
        Person[] people = {new Person("Nancy"), new Person("Tony"), new Person("Bob")};

//
        for (int i = 0; i < people.length; i += 1) {
            System.out.println(people[i].getName()); // people= references the new array, getName() is a method/function applies the property of name from the Person class
        }
//
//        System.out.println(Arrays.toString(peeps));
//        System.out.println(Arrays.toString(people));

        //using an enhanced-for loop
        //from the curriculum: When using the enhanced for, we must specify what collection we are iterating over,
        // a variable to hold each element, and the type of each element in the collection.
        for (Person p : people) {
            System.out.println(p.getName());
        }


    //Create a static method named addPerson. It should accept an array of Person objects,
        // as well as a single person object to add to the passed array.
        // It should return an array whose length is 1 greater than the passed array,
        // with the passed person object at the end of the array.

        Person[] newGroup = addPerson(people, new Person("Delia")); //people is the array of person objects,
        for (Person p : newGroup) {
            System.out.println(p.getName());
        }

    }


    }

