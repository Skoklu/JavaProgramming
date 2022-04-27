package day38_Inheritance.carTask;

public class Car {

    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;
    public int miles;

    public Car(String brand, String model, int year, double price, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start() {
        System.out.println(brand + " "+model+" is started");

    }

    public void drive() {
        System.out.println(brand + " "+model+ " is driven");
    }

   // public void fly(){}      //fly i s not coomon for all the cars, and parent class should -->
    // only contain the common feature of  sub classes

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= £" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
/*
Warmup task:
	carTask:
		Create a class called Car
			instance variables:
				brand, model, year, price, color, miles

				add a constructor to set all the fields

			instance methods:
				start(), drive(),toString()

 */
