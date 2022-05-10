package day46_Polymorphism;

import day39_Recap.shapeTask.Square;
import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Dog;
import day44_Abstraction.animalTask.Playable;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Rectangle;
import day45_Abstraction.shapeTask.Shape;
import day45_Abstraction.shapeTask.Triangle;

import java.awt.*;
import java.util.ArrayList;

public class PolymorphismIntro {

    public static void main(String[] args) {


        String str = "Wooden Spoon";

        Integer n1 = 2;

        Double n2 = 5.5;

        Boolean r1 = true;

        Object [] array={str, n1, n2, r1, new Circle(4), new Square(10)};
/*
      WebDriver driver;

      driver = new ChromeDriver();

      driver = FireFoxDriver();*/

       Employee tester1 = new Tester("Ali", 30, 'M', 42, "QA",100000);
        Employee  developer1 = new Developer("Alex", 28, 'M',32,
                "Developer",125000);
        Employee  teacher1 =new Teacher("Angal", 34, 'F', 52,
                "Math Teacher", 85000);
        Employee  driver1 = new Driver("Jhon", 43,'M', 62,
                "Lyft Driver", 75000.00);

        ArrayList<Employee> cydeoEmployee = new ArrayList<>();

        cydeoEmployee.add(tester1);
        cydeoEmployee.add(developer1);
        cydeoEmployee.add(teacher1);
        cydeoEmployee.add(driver1);


        System.out.println("------------------------------------------------------------------");

        Employee employee1 = new Tester("Ali", 30, 'M', 42, "QA",100000);
        employee1.work();
        //employee1.bugReport();

        System.out.println("------------------------------------------------------------------");


        Employee  employee2 = new Developer("Alex", 28, 'M',32,
                "Developer",125000);
        employee2.work();


        System.out.println("--------------------------------------------------------------");

        Employee employee3 = new Teacher("Angal", 34, 'F', 52,
                "Math Teacher", 85000);

        employee3.work();


        System.out.println("--------------------------------------------------------------");


        Employee employee4 =  new Driver("Jhon", 43,'M', 62,
                "Lyft Driver", 75000.00);

        employee4.work();

        System.out.println("--------------------------------------------------------------");

        Animal animal = new Dog("Max","Husky", 'M', 3, "Small", "White");
        animal.drink();
        animal.eat();
        System.out.println(animal);
        //animal.play();
       // animal.bark();

        System.out.println("--------------------------------------------------------------");


        Playable animal2 = new Dog("Max","Husky", 'M', 3, "Small", "White");
        System.out.println(animal2.isFriendly);
        animal2.play();
       // animal2.drink();
        //animal2.eat();


        System.out.println("--------------------------------------------------------------");


        Shape shape1 =new Circle(5);
        shape1.area();
        shape1.perimeter();
     System.out.println(shape1.perimeter());
     System.out.println(shape1.area());
     //System.out.println(shape.getRadius());
     //System.out.println(shape.Pi);

     boolean isSquare = shape1 instanceof day45_Abstraction.shapeTask.Square;
     boolean isRectangle = shape1 instanceof Rectangle;
     boolean isTriangle = shape1 instanceof Triangle;
     boolean isCircle = shape1 instanceof Circle;

     System.out.println("isSquare = " + isSquare);
     System.out.println("isRectangle = " + isRectangle);
     System.out.println("isTriangle = " + isTriangle);
     System.out.println("isCircle = " + isCircle);

     /*
     WebDriver driver:

     if(driver instanceof Chrome){
     Chrome browser will open
     }else if (driver instanceof firefox){
     FireFox browser will be open
     }
      */







/*
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new Chromedriver();

        driver1.get(amazon);
        driver2.get(google);

        Animal animal1 = new Dog();
        animal.drink();

        Animal animal2 = new Cat();
        animal.drink();

        Animal animal3 = new Tiger();
                animal3.drink();
                */
    }
}
