package shapes;

public class Circle {

    //This class should have a private radius property that is set through the constructor,
    // and various methods for getting information about the circle, detailed below.

//    public Circle(double radius);
//    public double getArea();
//    public double getCircumference();

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}



