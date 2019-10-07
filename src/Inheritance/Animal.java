package Inheritance;



//1. Make a class Animal that has instance properties for...
// - age
// - species
// - isAlive
//Include a constructor that sets these properties and getters and setters

 class Animal {

    private int age;
    private String species;
    private boolean isAlive;


    public Animal(int age, String species, boolean isAlive) { //constructor that takes in input to add properties to the class. in this instance, it's age, species, and isAlive
        this.age = age; //using this. because the fields visibility is set to private
        this.species = species;
        this.isAlive = isAlive;
    }

     public Animal(int age, String species){ //constructor that takes in input to add properties to the class. in this instance, it's age, species, and isAlive
         this.age = age; //using this. because the fields visibility is set to private
         this.species = species;

     }

        public int getAge() {

            return age;
        }

        public void setAge(int age) { this.age = age;
        }

        public String getSpecies() {

            return species;

        }

        public void setSpecies(String species) {

            this.species = species;
        }

    public boolean isAlive() {

        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {

        this.isAlive = isAlive;
    }

}



