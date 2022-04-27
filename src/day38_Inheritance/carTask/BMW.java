package day38_Inheritance.carTask;

public class BMW extends Car{


    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){

        System.out.println(brand+" "+model+ " breaks down every 100 miles");
    }
    public void race(){
        System.out.println(brand + " "+ model+ " is a racing car");
    }
    public void start (){
        System.out.println("Turn on the mechanic then jump start "+brand+" "+model);
    }
}

/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */
