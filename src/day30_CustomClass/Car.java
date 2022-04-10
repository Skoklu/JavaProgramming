package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void  setInfo(String carBrand, String carModal, String carColor, int carYear, double carPrice){

        brand =carBrand;
        model = carModal;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

    public String toString() {  //toString roles is printing the object on the console
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modal='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving "+brand+" "+model);

    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
