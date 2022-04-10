package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator{

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);



        System.out.println("Enter his/her hourlyRate:" );
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours he/she works in a week: ");
        int weeklyHours= input.nextInt();

        double salary = (weeklyHours * hourlyRate * 52);

        System.out.println("Enter state tax (in percentage)" );
        double st = input.nextDouble();

        double stateTax = salary * st;

        System.out.println("enter federal tax (in percentage)");
        double ft = input.nextDouble();

        double federalTax = salary * ft;



        double totalTax = (federalTax + stateTax);

        System.out.println("Salary= $" +salary);
        System.out.println("State Tax= $" + stateTax);
        System.out.println("federal Tax= $" + federalTax);
        System.out.println("Total Tax= $" + (stateTax + federalTax));
        System.out.println("Net Income = $"+ (salary - totalTax));

            input.close();




    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome

 */