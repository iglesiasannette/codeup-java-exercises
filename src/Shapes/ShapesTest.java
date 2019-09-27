package Shapes;

//Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method.
// Inside the main method, create a variable of the type Rectangle named box1 and assign it a new instance of the
// Rectangle class with a width of 4 and a length of 5
//verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//create a variable of the type Rectangle named box2 and assign it a new instance of the
// Square class that has a side value of 5.
//verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods
// are being called on each object?


// ****Answer: since the getArea and getPerimeter methods are being overridden, the new
//methods in the Square class will run. If we wanted the getArea and getPerimeter methods from the Rectangle class
//to apply, we should delete the methods from the Square class.

public class ShapesTest {
        public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
            System.out.println("The perimeter of box 1 is: " + box1.getPerimeter());
            System.out.println("The area of box1 is: " + box1.getArea());

        Rectangle box2 = new Square(5);
            System.out.println("The perimeter of box2 is: " + box2.getPerimeter());
            System.out.println("The area of box2 is: " + box2.getArea());

    }
}
