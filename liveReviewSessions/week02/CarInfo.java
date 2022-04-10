package week02;

public class CarInfo {

    public static void main(String[] args) {


        //I want you to give example of the car that you will buy after you find well paid job

        int year = 2022;
        String make = "Audi";
        String model = "A6";
        // automatic = true; manuel = false;
        boolean transmission = true;
        String color = " black";
        int milage = 0;
        int price = 100_000;  //for Europe
        System.out.println(year+ " "+ make+ " "+model+"\nAutomatic Transmission : "+transmission);
        System.out.println(color+" "+milage+ " kilometers "+price +" Euros");

        // Let's turn this value into Tl 1 euro = 15.5 Tl

        double priceInTL = price * 15.5;

        double taxRate = 1.80;  //for this kind of cars

        double priceAfterTaxInTL = priceInTL+(priceInTL*taxRate);

        System.out.println("priceAfterTaxInTL = " + priceAfterTaxInTL);

        // Variables are used, because it makes our data reusable and maintainable





    }
}
