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


    public Square(int side){
        super(side, side);
        this.side = side;


    }
        public int side;

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    //@Override
    public void setLength() {

    }

    //@Override
    public void setWidth() {

    }



}
