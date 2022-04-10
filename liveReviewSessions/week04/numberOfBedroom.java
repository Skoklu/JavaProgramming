package week04;

public class numberOfBedroom {

    public static void main(String[] args) {

        int numberOfBedroom = 3;
        double startingPrices= 2450.0;

        switch (numberOfBedroom){
            case 0:
                System.out.println("Studio");
                startingPrices = 1454.0;
                break;
            case 1:
                System.out.println("You have selected One bedroom apartment");
                startingPrices= 1725.0;
                break;
            case 2:
                System.out.println("You have selected Two bedroom apartment");
                startingPrices =2899.0;
                break;
            case 3:
                System.out.println("You have selected three bedroom apartment");
                startingPrices= 2450.0;
                break;
            default:
                System.out.println(numberOfBedroom+"Not available");


        }
        System.out.println("Starting price:$"+startingPrices);
    }
}
/*
Write program for Leasing office.

numberOfBedrooms variable already declared and assigned value using Scanner:

startingPrice is set to 0.

prices 1 bedroom - 1100 2 bedroom - 1850 3 bedroom - 2550

Example Flow:

Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
1
One Bedroom Selected
Starting Price: 1100
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
3
Three Bedroom Selected
Starting Price: 2550
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Welcome to Cybertek Apartments!
Number of bedrooms you are interested:
5
No such Bedrooms available
Note: If an invalid bedroom number is given no price is displayed
 */