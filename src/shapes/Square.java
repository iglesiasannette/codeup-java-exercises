//package shapes;
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


//Abstractions exercise

package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }


    //Because the length of all sides of a square are the same,
    // the methods for setting the length and the width should set both protected properties.
    @Override
    void setLength(double length) {
        super.length = length;
        super.width = length;
    }

    @Override
    void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * super.width;
    }

    @Override
    public double getArea() {
        return (super.width * super.width);
    }
}
