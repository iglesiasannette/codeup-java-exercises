package movies;

// Exercise 3. Movie List
//
//We are going to build an application that keeps track of movies and displays them by category.
//
//Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//Create a class named Movie. It should have private fields for name and category, and a constructor that sets
// both of these. Create methods to access these properties and change them (getters and setters).



public class Movie {

    //encapsulation: when properties are set to private and can only be accessed and modified by the class they are encapsulated in
    private String name;
    private String category;

    public Movie(String name, String category) {//constructor that takes in input to add properties to the class. in this instance, it's name and category
        this.name = name; //using this. because the fields visibility is set to private
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
