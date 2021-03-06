package day47_Polymorphism;

import day43_Abstraction.employeeTask.*;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shapeTask.Circle;
import day45_Abstraction.shapeTask.Shape;
import day45_Abstraction.shapeTask.Square;


public class ReferenceTypeCasting {


    public static void main(String[] args) {


        //Shape shape = (Shape) new Circle(4);  //upCasting   NOT need write second (Shape),it is casting implicitly

        Shape shape2 = new Circle(4);  //upCasting / implicitly

        //WebDriver driver = (WebDriver) new ChromeDriver();

        //Dog2 dog = new Dog("Max", "Husky", 'M', 3, "Small", "White");
       // Dog dog3 = dog2;


        Animal animal = new Dog("Max", "Husky", 'M', 3, "Small", "White");

        //animal.bark;  //I don't assign
        Dog dog = (Dog)animal;   //downCasting

        System.out.println(animal.getName());
        System.out.println(dog.getName());
        System.out.println(animal.getAge());

        //animal.bark;
        ((Dog) animal).bark(); //downCasting
        dog.bark();


        //this side is reference type   //this side is object type
        Animal animal2 =               new Cat("Jim", "Scotish", 'M', 3, "Small", "White");

        //Cat cat = (Cat) animal2;
        //cat.meow();

        ((Cat) animal2).meow();
        //((Dog)animal2).bark();


        System.out.println("----------------------------------------------------");

        Employee employee = new Tester("Ali", 30, 'M', 42, "QA",100000);
        ((Tester) employee).bugReport();
        //((Tester) employee).unitTest();
        //((Developer) employee).unitTest();

        // Driver driver = (Driver) employee;
        Person person = (Person) employee;
        // Teacher teacher = (Teacher) employee;

        System.out.println("--------------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();
       //((Cube) s1).volume();  //THERE IS NO RELATIONSHIP between Circle and Cube





    }
}
