package movies;

// Exercise 3. Movie List
//
//We are going to build an application that keeps track of movies and displays them by category.
//
//Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//Create a class named Movie. It should have private fields for name and category, and a constructor that sets
// both of these. Create methods to access these properties and change them (getters and setters).




    public class Movie  {
        private String name;
        private String category;

        public Movie(String name, String category) { //constructor
            this.name = name;
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

