//package Shapes;
//
//public class Square extends Rectangle {
//
//    //Create a class named Square, also inside of shapes, that extends Rectangle. Square
//    // should define a constructor that accepts one argument, side, and calls the parent's constructor
//    // to set both the length and width to the value of side.
//
//    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//    //
//    //
//    //perimeter = 4 x side
//    //area = side ^ 2
//    //Re-run your ShapesTest class. How can you determine which getArea and getPerimeter
//    // methods are being called on each object?
//
//
//    public int side;
//
//    public Square(int side){
//        super(side, side); // grabs the side parameter and equates the value to the parent's length & width, resulting in the area being able to be calculated
//        this.side = side;
//    }
//
//
//    @Override
//    public int getPerimeter() {
//
//        return 4 * side;
//    }
//
//    @Override
//    public int getArea() {
//        return side * side;
//    }
//
//
//    public void setLength() {
//
//    }
//
//
//    public void setWidth() {
//
//    }
//
//
//
//}

package Shapes;

public class Square extends Rectangle {

    //Create a class named Square, also inside of shapes, that extends Rectangle. Square
    // should define a constructor that accepts one argument, side, and calls the parent's constructor
    // to set both the length and width to the value of side.

    //In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
    //
    //
    //perimeter = 4 x side
    //area = side ^ 2
    //Re-run your ShapesTest class. How can you determine which getArea and getPerimeter
    // methods are being called on each object?


   //**Version Two

    public Square(int side){
        super(side, side); // grabs the side parameter and equates the value to the parent's length & width, resulting in the dimensions being able to be calculated

    }


    @Override
    public int getPerimeter() {

        return 4 * super.length; // one input is being accepted by square, so the name of the variable is irrelevant as the method is valid
    }

    @Override
    public int getArea() {
        return (int) Math.pow(super.length, 2) ;
    }


    public void setLength() {

    }


    public void setWidth() {

    }



}
