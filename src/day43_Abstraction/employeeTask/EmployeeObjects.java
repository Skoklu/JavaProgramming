package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        //We don't create an object class from Person and Employee, because they are abstraction class
        //Person person1 = new Person("Josh", 35, 'M');
       // Employee employee = new Employee("Ali", 30, 'M', "SDET", 115000.00)//

        Tester tester1 = new Tester("Ali", 30, 'M', 42, 100000);
        Developer developer1 = new Developer("Alex", 28, 'M',32, "Developer",125000);
        Teacher teacher1 =new Teacher("Angal", 34, 'F', 52, "Math Teacher", 85000);
        Driver driver1 = new Driver("Jhon", 43,'M', 62,"Lyft Driver", 75000.00);


        System.out.println(tester1);
        System.out.println(developer1);
        System.out.println(teacher1);
        System.out.println(driver1);

        tester1.work();
        tester1.sleep();
        tester1.bugReport();
        tester1.eat();

        System.out.println("-----------------------------------------------------------");

        developer1.work();
        developer1.sleep();
       // developer1.bugReport();
        developer1.eat();
        developer1.unitTest();

        System.out.println("-----------------------------------------------------------");

        teacher1.work();
        teacher1.sleep();
        teacher1.eat();

        System.out.println("-----------------------------------------------------------");

        driver1.work();
        driver1.sleep();
        driver1.eat();


    }
}
