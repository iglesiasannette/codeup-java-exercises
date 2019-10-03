package fileIONotes;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIONotes {



    //
        public static void main(String[] args) {
            //
            //        // ============================ PATH
            //
            ////        Path fileLecturePath = Paths.get("src", "FileIoLecture.java");
            ///Path is the interface, Paths is the class


            ////        System.out.println(fileLecturePath);
            ////        System.out.println(fileLecturePath.toAbsolutePath());

            //There are two types of paths:
            //absolute paths: specified from the filesystem root
            //relative paths: relative to the current working directory

            ////        Path otherPath = Paths.get("src", "../", "src", "../", "src", "FileIoLecture");
            ////        System.out.println(otherPath);
            ////        System.out.println(otherPath.normalize());
            ////        System.out.println(otherPath.toAbsolutePath());
            ////        System.out.println(otherPath.normalize().toAbsolutePath());
            //
            //        // ============================ FILE METHODS
            //
            ////        System.out.println(Files.exists(fileLecturePath));
            ////        System.out.println(Files.exists(Paths.get("bob.txt")));
            //determines wheter a file exists in the filesystem


//                String directory = "data"; //assigning the variable name directory to the "data"
//                String filename = "info.txt"; //assigning the variable name filename to the "info.txt//"
//                Path dirPath = Paths.get(directory, "sub-data", "sub-sub-data");
            //            Path pathToFile = Paths.get(directory, filename); // souting pathToFile displays the filepath in the console


//                Path dataDirectory = Paths.get(directory); //assigning the variable name dataDirectory to the Paths.get(directory);
//                Path dataFile = Paths.get(directory, filename); //assigning the variable name dataFile to the "data"
//
//                System.out.println(dataDirectory); //souting the variables as to see relative path
//                System.out.println(dataFile);
//

            //this method creates a directory with the data file if that relative path doesn't exist
//                if (!Files.exists(dataDirectory)) {
//
//                    try {
//                        Files.createDirectories(dataDirectory);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//        //
//                }
//
//                if (!Files.exists(dataFile)) {
//                    try {
//                        Files.createFile(dataFile);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//    //
            //
            //        // ============================ READING FILES
            //
            ////        Path p = Paths.get("src/lec/test.txt");
            ////
            ////        List<String> lines = new ArrayList<>(); //the variable lines is declared outside the try/catch because it needs to exist in a wider scope .
            //                                                  //inside the try/catch would render it block scoped
            ////
            ////        try {
            ////            lines = Files.readAllLines(p);
            ////        } catch (IOException e) {               //this line catches an exception and throws an error if the file doesn't exist
            ////            e.printStackTrace();
            ////        }
            ////
            ////        System.out.println(lines);
            ////
            ////        for (String name : lines) {
            ////            System.out.println("Hello, " + name + "!");
            ////        }
            //
            //
            //
            //
            //
            ////        try {
            ////            List<String> contents = Files.readAllLines(
            ////                Paths.get("data", "bob.txt")
            ////            );
            ////            for (String line : contents) {
            ////                System.out.println(line);
            ////            }
            ////        } catch (Exception e) {
            ////            System.out.println("Exception!");
            ////            e.printStackTrace();
            ////        }
            //
            ////        try {
            ////            List<String> contents = Files.readAllLines(Paths.get("data/info.txt"));
            ////            System.out.println(contents.toString());
            ////        } catch (IOException e) {
            ////            System.out.println("Exception!");
            ////            e.printStackTrace();
            ////        }
            //
            //
            //        // ============================ WRITING FILES
            //
            ////        Path p = Paths.get("src/lec/test.txt");
            ////
            ////        List<String> newNames = Arrays.asList("John", "Fred", "asdf");
            ////        try {
            ////            Files.write(p, newNames);
            ////        } catch (IOException e) {
            ////            e.printStackTrace();
            ////        }
            //

            /// .write can take on 3 arguments. the 3rd is optional and will specify what to do. ex: using "append" as a third argument
            ///.write can only create files that don't exist, it can not create directories. ".createDirectories" would need to be used
            //
            ////            Path p = Paths.get("./src/lec",  "test.txt");
            ////
            ////            List<String> names = new ArrayList<>();
            ////            names.add("Tim");
            ////            names.add("Sally");
            ////            names.add("Mary");
            ////            try {
            ////                Files.write(p, names, StandardOpenOption.APPEND);
            ////            } catch(IOException e) {
            ////                e.printStackTrace();
            ////            }
            ////
            ////            String directory = "data";
            ////            String filename = "info.txt";
            ////            Path dataDirectory = Paths.get(directory);
            ////            Path dataFile = Paths.get(directory, filename);
            ////
            ////            List<String> nums = new ArrayList<>();
            ////            nums.add("1");
            ////            nums.add("2");
            ////            nums.add("3");
            ////
            ////            try {
            ////                Files.write(dataFile, nums, StandardOpenOption.APPEND);
            ////            } catch(IOException e) {
            ////                System.out.println("Exception!!!");
            ////                e.printStackTrace();
            ////            }
            //
            //        // ============================ ADDITIONAL SLIDE EXAMPLES
            //
            //
            //        // Print out each line in an existing file, along with the line number
            //

            //          **Example for deleting an item
            ////        Path groceriesPath = Paths.get("data", "groceries.txt");

            ////        try {
            //              List<String> groceryList = Files.readAllLines(groceriesPath);
            //              for (int i = 0; i < groceryList.size(); i += 1) {
            //    ////            System.out.println((i + 1) + ": " + groceryList.get(i));
            //    ////        }
            ////        } catch (IOException e) {
            ////            e.printStackTrace();
            ////        }
            ////
            ////
            //
            //
            //        // Add a line to an existing file
            //
            ////        try {
            ////            Files.write(
            ////                    Paths.get("data", "groceries.txt"),
            ////                    Arrays.asList("eggs", "bread", "milk") // list with one item
            ////            );
            ////        } catch (IOException e) {
            ////            e.printStackTrace();
            ////        }
            //
            //        // Replace "milk" with "cream"
            //
            ////        List<String> lines = null;
            ////        try {
            ////            lines = Files.readAllLines(Paths.get("data", "groceries.txt"));
            ////        } catch (IOException e) {
            ////            e.printStackTrace();
            ////        }
            //
            //
            //
            ////        List<String> newList = new ArrayList<>();
            ////        for (String line : lines) {
            ////            if (line.equals("bread")) {
            ////                newList.add("starch");
            ////                continue;
            ////            }
            ////            newList.add(line);
            ////        }
            ////
            ////        System.out.println(newList);
            ////
            ////        try {
            ////            Files.write(Paths.get("data", "groceries.txt"), newList);
            ////        } catch (IOException e) {
            ////            e.printStackTrace();
            ////        }
            //
            //    }
            //}




                readContents();


        }


    //Exercises
    //Create a method for retrieving file contents.
    //
    //The method should accept a string that is the location of the file, and return a list of strings where
    // each string is a line in the file.



    //breakdown
//                Path retrieveContents = Paths.get("src", "test");
//                //Path retrieveContents = Paths.get("src/test"); works as well
//                System.out.println(retrieveContents); //souts the relative path
//
//                List<String> lines = new ArrayList<>(); //creates an empty arrayList
//
//                try {
//                     lines = Files.readAllLines(retrieveContents);
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                    System.out.println(lines); //the contents as an array. each line is an element
//
//                ///this next part iterates through the array and prints the contents line by line
//                int count = 1;
//                for (String line : lines) {
//
//                System.out.println(count+". " + line);
//                count++;
//            }



    public static List<String> getContents(String location) throws IOException
    {
        Path p = Paths.get(location);
        return Files.readAllLines(p);
    }


    //Example 1
//    public static void readContents() {

        // **Finished Solution 1
//        Path retrieveContents = Paths.get("src/test");
//        //Path retrieveContents = Paths.get("src/test"); works as well
//        System.out.println(retrieveContents); //souts the relative path
//
//        List<String> lines = new ArrayList<>(); //creates an empty arrayList
//
//        try {
//            lines = Files.readAllLines(retrieveContents);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(lines); //the contents as an array. each line is an element
//
//        ///this next part iterates through the array and prints the contents line by line
//        int count = 1;
//        for (String line : lines) {
//
//            System.out.println(count + ". " + line);
//            count++;
//        }
//
//    }

    //Finished Solution 2

    public static void readContents() {

        List<String> lines = new ArrayList<>(); //creates an empty arrayList

        try {
            lines = getContents("src/test");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines); //the contents as an array. each line is an element

        ///this next part iterates through the array and prints the contents line by line
        int count = 1;
        for (String line : lines) {

            System.out.println(count+ ". " + line);
            count++;
        }

    }


}
