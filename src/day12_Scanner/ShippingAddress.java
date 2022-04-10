package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building name");
        String buildingName = input.next();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter yor state name");
        String stateName = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println(" Enter your Country name");
        String countryName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingName = " + buildingName);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);

        input.close();
    }
}
/*
1. Enter your full name (nextLine () )
2. Enter your building name (next() )
3. Enter your street name  (nextLine() )
4.Enter your city name    (nextLine() )
5. Enter your state name     (next() )
6.Enter your zip code (next() )


Display the shipping address
 */