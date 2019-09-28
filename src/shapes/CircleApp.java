package shapes;

import util.Input;

public class CircleApp {

    //** prompt the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
    //The formulas for circumference and area:
    //
    //circumference = 2 x pi x radius
    //area = pi x (radius ^ 2)


    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println("The area of the circle is : " + circle.getArea());
        System.out.println("The circumference of the circle is:  " + circle.getCircumference());

        /*Bonus

        After a circle is created, use the yesNo method of your Input class and ask the user if they would like to make another. Continue creating circles and displaying information about them until the user says they do not want to continue.*/
//        System.out.println("\nWould you like to make another circle? \n");
//        input.yesNo();
//        if (input == true) {

//        }
    }





}

