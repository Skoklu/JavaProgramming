package day43_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(String name, double width, double length) {
        super(name);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <=0 || width >length){
            throw new RuntimeException(width+ " is invalid entry");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <=0 || length <width){
            throw new RuntimeException(length+ " is invalid entry");
        }
        this.length = length;
    }

    @Override
    public void perimeter() {
        System.out.println( 2* (length + width));

    }

    @Override
    public void area() {
        System.out.println(length * width);

    }

    public String toString() {
        return "Rectangle{" +
                "name=" + getName() +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
/*
Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)



 */