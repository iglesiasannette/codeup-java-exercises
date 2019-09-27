//Shapes
//
//Inside of your shapes directory, create a class named Rectangle. It should have protected properties for
// both length and width. Rectangle should define a constructor that accepts two numbers for length and width,
// and sets those properties.
//
//Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values.
// The formulas for both follow:

package Shapes;

public class Rectangle {

    protected int length;
    protected int width;



    public Rectangle(int length, int width){
        this.length = length;
        this.width= width;

    }

    public int getArea() {

        return this.length * this.width;
    }

    public int setArea() {

        return this.length * this.width;
    }

    public int getPerimeter() {

        return (2 * this.length) + (2 * this.width) ;
    }

    public int  setPerimeter() {

        return (2 * this.length) + (2 * this.width) ;
    }



}
