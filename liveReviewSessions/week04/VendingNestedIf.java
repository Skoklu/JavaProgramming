package week04;

public class VendingNestedIf {

    public static void main(String[] args) {
        String selection = "drink";
        String drinkItem = "coffee";
        String snackItem = " chips";

        //Notes on String equality: we will not use "==" sign for string equality, we will use

        if (selection == "drink") {
            System.out.println("drink option is selected");
            if (drinkItem == "tea") {
                System.out.println("Tea item is selected");
            }
            else if (drinkItem == "coffee") {
                System.out.println("Coffee item is selected");
        }
        }else if (selection == "snack") {
            System.out.println("Snack option is selected");

        }else if (snackItem =="Chips"){
            System.out.println("Chips is selected");
        }
        else {
            System.err.println("INVALID ENTRY");
        }
        if (true){
            System.out.println("Hello");
            System.out.println("Running");
        }
    }
}
/*
add new class VendingNestedIf
add main method

selection = "drink" or can be "snack"
drinkItem = "tea" , "coke"
snackItem = "chips" , "candy"

when selection is "drink":
"drink option is selected"

    when drinkItem is "tea":
        "tea is selected"
    when drinkItem is "coke":
        "coke is selected"
when selection is "snack"
"snack option is selected"

    when snackItem is "chips":
        "chips item is selected"
    when snackItem is "candy":
        "candy item is selected"
===================================
 */

//Sometimes we can skip use curly "{}" braces with if condition
//WHEN:
//if you have only one statement in the IF block