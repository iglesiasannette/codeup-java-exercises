package Inheritance;




 class Dog extends Animal {



    public String breed;
    public String name;

    public Dog(int age, String species, boolean isAlive, String breed, String name) { // we need to fill in the parameters the parent requires in the child class
        super(age, species, isAlive); // super allows us to pull the properties from the parent class and apply them to the child class
        this.breed = breed;
        this.name = name;


     }

    public String getBreed() {

        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

}
