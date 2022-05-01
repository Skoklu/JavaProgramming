package day43_Abstraction.shapeTask;

public class Circle extends Shape {

    private double radius;
    public static double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            throw new RuntimeException(radius+ " is invalid entry");
        }
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;


    }

    @Override
    public void perimeter() {
        System.out.println( 2 * (pi * radius));

    }

    @Override
    public void area() {
        System.out.println(pi * radius*radius);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
/*
Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi
 */