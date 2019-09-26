package Inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Dog d = new Dog(4, "Canis familiaris", true, "lab", "Luna");
        System.out.println("My dog is " + d.getAge() + " and is of the species " + d.getSpecies() + ".\n" );
        System.out.println("She most definitely is alive, this is " + d.isAlive() + " . She is of the " + d.breed  + " breed and her name is " + d.name + "." );






    }
}
