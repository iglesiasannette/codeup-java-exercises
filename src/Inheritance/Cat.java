package Inheritance;

public class Cat extends Animal {

    public String breed;
    boolean isShorthair;
    private String origin;


    public void setShorthair(boolean shorthair) {
        isShorthair = shorthair;
    }

    public Cat(int age, String species, String breed, boolean isShorthair, String origin) { // we need to fill in the parameters the parent requires in the child class
        super(age, species); // super allows us to pull the properties from the parent class and apply them to the child class
        this.breed = breed;
        this.isShorthair = isShorthair;
        this.origin = origin;

    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isShorthair() {
        return isShorthair;
    }

    public void setIsShorthair(boolean isShorthair) {
        this.isShorthair = isShorthair;
    }

     public String getOrigin() {
         return origin;
     }

     public void setOrigin(String origin) {
         this.origin = origin;
     }



}
