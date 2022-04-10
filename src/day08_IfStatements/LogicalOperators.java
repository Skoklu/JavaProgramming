package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        //&& (And) OPERATOR
       String name = "Steven";
       int age = 19;
       String citizen = "UK";

       boolean isEligible = age >= 18 && citizen == "USA";
       //                    19 >= 18 && "UK"    == "USA";
        //                    True    &&   false   =====>false

        System.out.println(name + " is eligible to vote: " + isEligible);


        System.out.println("-----------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2>= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: "+isEligible2);


        System.out.println("----------------------------------------");

        //||(Or) OPERATORS

        String name3 = "Shay";

        int age3 = 21;
        char gender ='F';

        boolean isEligible3 = age3 >= 18 && (gender =='M' || gender =='F');
        //                     21 >= 18  && ( 'F' == 'M'  || 'F' == 'F' )
        //                      true     &&  ( false      ||  true)
        //                       true    &&     true
        //                          true

        System.out.println(name3 + " is eligible to register: "+ isEligible3);


        System.out.println("----------------------------------------");

        String name4 = "James";

        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        //                      false                 ||    false

        System.out.println(name4 + " is eligible to apply for US citizenShip: "+ isEligible4);

        /*
        String name4 = "James";

        String countryOfBirth = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitzen == true;
        //                      true                 ||    false

        System.out.println(name4 + " is eligible to apply for US citizenShip: "+ isEligible4);

        output: James is eligible to apply for US citizenShip: true
         */

        System.out.println("-------------------------------");


        String student = "Breanne";

        double gpa = 2.5;
        int familyIncome = 400000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(name + " is eligible for scholarship: "+ isEligible5);

        System.out.println("---------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("-------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

     System.out.println("passed = "+passed);
     System.out.println("failed = "+ failed);

        /*
        System.out.println("-------------------------------");


        String student = "Ali";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
         //                       false    ||   true
         //                          true
        System.out.println(name + " is eligible for scholarship: "+ isEligible5);
        output : Ali is eligible for scholarship: Ture
         */









    }


}

// &&:both
//in logical and operator, both expressions need to be true on order to return true

// ||: either
//in logical or operator only one expression needs to be true in order to return true

/*
String name = "Arion";
       int age = 14;
       String citizen = "USA";

       boolean isEligible = age >= 18 && citizen == "USA";
       //                    14 >= 18 && "USA"    == "USA";
        //                    false    &&   true   =====>false

        System.out.println(name + " is eligible to vote: " + isEligible);
output: Arion is eligible to vote: false

-----------------------------------------------
String name = "Arian";
       int age = 18;
       String citizen = "USA";

       boolean isEligible = age >= 18 && citizen == "USA";
       //                    18 >= 18 && "USA"    == "USA";
        //                    True    &&   true   =====>true

        System.out.println(name + " is eligible to vote: " + isEligible);
        output: Arion is eligible to vote: true

 */

/*
 String name2 = "Josh";
        int creditScore = 800;
        int age2 = 42;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2>= 21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: "+isEligible2);

        output: Josh is eligible for loan: false

 */