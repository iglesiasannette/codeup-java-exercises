



public class Person {

    //1. Object basics
    //
    //Create Person class inside of src that has a private name property that is a string, and the following methods:
    ////
    // returns the person's name
    //public String getName();
    //// changes the name property to the passed value
    //public void setName(String name);
    //// prints a message to the console using the person's name
    //public void sayHello();

    private String name;

    public Person(String name) {  //< this is the constructor for the class

        this.name = name;
    }


    public String getName() { //this method returns the person's name
        return this.name; // refers to the name of the object as it is initialized as being private above
    }

    public void setName(String name){ //this is a method of the class
        this.name = name; // takes in the input and changes the name property to the passed value

    }

    public void sayHello(){ //this is a method of the class that prints a message the console using the person's name
        System.out.println( "Hello from " + this.name + "!"); // or System.out.printf("Hello, %s!\n", this.name);
    }


}







class PersonTest {
    public static void main(String[] args) {

///////////////////////////////////////////////////////
        Person genericPerson = new Person("paul");
        genericPerson.sayHello();
///////////////////////////////////////////////////////
        Person Annette = new Person("annette"); // Person: class and data type, Annette: name of new instance of the Person class, "= new Person ()" is the creation of a new instance
//        Annette.setName("Annette"); //passed a string with my name through the setName method
        Annette.sayHello();// this method/function applies the passed string name as this.name and prints out the sayHello method
        System.out.println(Annette.getName());// gets the name since the String name is set to private at first
///////////////////////////////////////////////////////
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
///////////////////////////////////////////////////////
        Person person1 = new Person("janice");
        Person person2 = person1;
        System.out.println(person1 == person2);
//            *** validates as true
//
//        Person person1 = new Person();
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//         ***person1 takes on the same properties as person2

    }
}
