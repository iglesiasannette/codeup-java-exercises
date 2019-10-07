package Inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Dog d = new Dog(6, "Canis familiaris", true, "lab", "Luna");
        System.out.println("My dog is " + d.getAge() + " and is of the species " + d.getSpecies() + ".\n" );
        System.out.println("She most definitely is alive, this is " + d.isAlive() + " . She is of the " + d.breed  + " breed and her name is " + d.name + ".\n" );


        Cat C = new Cat(5000, "Prionailurus Bengalensis", "Leopard Cat", true,  "Neolithic China");


        System.out.println("The cat we are going to discuss today is the " + C.getBreed() + " of the " +  C.getSpecies() + "species.\n" +
                        "The origins of this creature trace back to " + C.getOrigin() + " and radiometric dating of \n" +
                        "Leopard Cat fossil remains excavated in Neolithic villages in China date as far back as " + C.getAge() + " years."
                );

        Animal Lucky = new Dog(12, "Canis lupus familiaris", true,"American Cockerspaniel","Lucky");
        System.out.println();


    }
}
