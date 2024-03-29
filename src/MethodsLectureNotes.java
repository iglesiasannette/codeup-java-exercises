public class MethodsLectureNotes {

    public static void main(String[] args) {


    }



    //** to create a method, you need public, static, the data type, the name of the method, and parenthesis for the parameters
    //** if a return method and return statement don't match, the code will not compile
    //** the method can be called to get the return

//        // ------ DEFINING AND CALLING METHODS WITH VARIOUS INPUTS
//        sayGreeting();
//        sayInput("Howdy");
//        returnSeven();
//        returnInt(3);
//        returnProductOfThreeNums(2.4, 8.7, 9);
//
//
//        // ------ OVERLOADING: when a method is provided different parameter types
//        sayHello();
//        sayHello(2);
//        sayHello("John");
//        sayHello("Salutations", "Kevin");
//
    //** the behavior of a method is going to depend on whether there's an input provided or not
//
//
//        // ------ RECURSION: when a method calls itself. useful when needing to do an action several times, much like a loop. IE - invoking itself within it's own function

//        countTo100Loop(1);
//        countTo100(1);



    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output
    public static void sayGreeting() {
        System.out.println("Hello");
    }

    // no returned output with input
    public static void sayInput(String input) {
        System.out.println(input);
    }

    // returned output without input
    public static int returnSeven() {
        return 7;
    }

    // return output given an input
    public static int returnInt(int someInt) {
        return someInt;
    }

    // return type based on multiple inputs
    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }


    // ----------- OVERLOADING

    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }


    // ----------- RECURSION

    public static void countTo100Loop(int num) {
        for (int i = num; i <= 100; i += 1) {
            System.out.println(i);
        }
    }

    public static int countTo100(int num) {
        System.out.println(num);
        return num == 100 ? num : countTo100(++num);
    }

    public static int powerOf10(int n) {
        if (n == 0) {
            return 1;
        }
        return powerOf10(n-1) * 10;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


}