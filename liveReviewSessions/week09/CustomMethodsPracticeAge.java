package week09;

public class CustomMethodsPracticeAge {

    public static void main(String[] args) {

        int person1Age = 10;
        if (person1Age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible to buy");
        }
        int person2Age = 20;
        if (person1Age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible to buy");
        }

        int person3Age = 30;
        if (person1Age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible to buy");
        }

        System.out.println("==============================");

        eligibleOrNot(person1Age);
        eligibleOrNot(person2Age);
        eligibleOrNot(person3Age);
        eligibleOrNot(45);
    }

    public static void eligibleOrNot (int age){

        if (age >= 21) {      // no return type
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible to buy");
        }
        return;
    }
}