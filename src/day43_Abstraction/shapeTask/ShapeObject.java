package day43_Abstraction.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("Rectangle",10.0,12.0);

        Square square1 = new Square("Square", 20.0);

        Circle circle1 = new Circle("Circle", 10);


        System.out.println("Rectangle: "+rectangle1);
        System.out.println("Square: "+ square1);
        System.out.println("Circle: "+circle1);

        System.out.println("---------------------------------------------------------");


        rectangle1.perimeter();
        rectangle1.area();

        square1.perimeter();
        square1.area();

        circle1.perimeter();
        circle1.area();


    }
}
