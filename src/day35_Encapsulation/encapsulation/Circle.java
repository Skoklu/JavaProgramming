package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;

    public static String name="Circle";
    public static double pi=3.14;

    public Circle(double radius) {
        setRadius( radius);
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }
    public double calcArea(){
      double  calcArea= (pi * radius*radius);
      return calcArea;
    }
    public double calcPerimeter(){
        double calcPerimeter=(2* pi*radius);
       return calcPerimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
/*
 public double calcCost() {

            double startingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;

            double totalPrice = startingPrice + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;

            return totalPrice;
        }
	2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */