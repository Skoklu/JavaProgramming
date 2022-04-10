package day04_Variables;

public class Circle {

    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter

        double PI = 3.14;
        double radius = 5.5;  // if the radius 10;
        double diameter = radius * 2;   //10 * 2
        double area = PI * radius * radius;     //10 * 10 * 3.14
        double perimeter = 2 * (PI * radius);     // 2 * 10 * 3.14


        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }



}
/*3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

 */