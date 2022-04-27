package day39_Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Square square1 = new Square(12);

        System.out.println(square1);

        System.out.println(square1.getName());

        System.out.println("---------------------------------------");


        Rectangle rectangle1 = new Rectangle(20,10);

        System.out.println(rectangle1);

        rectangle1.setLength(30);

        System.out.println(rectangle1.getLength());

        System.out.println(rectangle1);

        System.out.println(rectangle1.getName());

        System.out.println("---------------------------------------");


        Circle circle1 = new Circle(10);

        System.out.println(circle1);

        System.out.println(circle1.getName());

        circle1.setRadius(20);  // linked the setter
        System.out.println(circle1.getRadius());  //linked the getter

        System.out.println(circle1);


    }
}
