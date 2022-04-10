package week04;

public class AmazonFreeShippig {

    public static void main(String[] args) {
      double totalPrices=35.99;

        if (totalPrices >= 25){
           System.out.println("Free shipping eligible for your purchase : $"+totalPrices);
        }else{
            System.out.println("Not free shipping eligible: $"+totalPrices);

        }
        System.out.println("Thanks for shopping with us!");
    }
}
