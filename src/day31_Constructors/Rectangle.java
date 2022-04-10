package day31_Constructors;

public class Rectangle {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length * width;
    }
    public double calcPerimeter(){
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
create a custom class named rectangle
    Attributes:
            length, width

    Add a constructor that can set all the fields

    Actions:
            calculateArea(): calculates the area of the rectangle, returns it as double
            calculatePerimeter(): calculates the perimeter of the rec tangle, returns it is double
            toString(): displays the width, length, area and perimeter of the rectangle when an object
 */