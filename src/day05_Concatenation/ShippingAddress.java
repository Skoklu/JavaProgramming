package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Selma Koklu",
         buildingNumber = "63 Austin Court",
         streetName = "Village Road",
         city = "London",
         state = "England",
         zipCode = "EN1 2DY";

        //if we use comma "," instead of semi colon ";" end of the data it means that it is continuing to don't need to write "String".

        /*
        System.out.println(name + "\n" + buildingNumber + " "+
         streetName + " \n"+ city + " " + state + " \n" + zipCode);

         */

        String address = name + "\n" + buildingNumber + " "+
                streetName + " \n"+ city + " " + state + " \n" + zipCode;
        System.out.println(address);

    }
}


/*
1. Create a class called ShippingAddress.java 2. DeclarateTheFollowingVariables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
 */