import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {




    public static void main(String[] args) {

        //Array Basics
        // What happens when you run the following code? Why is Arrays.toString necessary?
        // answer: it is necessary to so as to see a string representation of the array in the console.
        // without toString, all you see is the reference ID because an array is an object type in java
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //1. Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
        // Iterate through the array and print out the name of each person in the array.
        Person[] people = {
        new Person("Nancy"),
        new Person("Tony"),
        new Person("Bob"),

        };
        ;
//        Person[] people = {new Person("Nancy"), new Person("Tony"), new Person("Bob")};

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



        //2B
        people = addPerson(people, new Person("Delia")); //people is the array from the Person class,
        people = addPerson(people, new Person("Sally"));


        for (Person newPeep : people) {
            System.out.println(newPeep.getName());
        }

    }

    //2A.Create a static method named addPerson. It should accept an array of Person objects,
    // as well as a single person object to add to the passed array.
    // It should return an array whose length is 1 greater than the passed array,
    // with the passed person object at the end of the array.
    //part 1
    private static Person[] addPerson(Person[] people, Person newPeep) { //first parameter is the input of an array of person objects, the second parameter is a single person object, hence the reference to the class but not square brackets
        Person[] newGroup = Arrays.copyOf(people, people.length + 1); //newGroup is the name of the new array
        newGroup[newGroup.length-1] = newPeep; // [newGroup.length - 1] is the last index, which is thew newPeep added
        return newGroup;
    }


    }

