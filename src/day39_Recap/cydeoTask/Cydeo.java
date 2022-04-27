package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {


        Developer developer1 =new Developer("Korkmaz",32,'M',123,135000);

        Tester tester1 = new Tester("Olga", 27, 'F', 124,126000);

        Teacher teacher1 = new Teacher("Daniel", 32, 'M',125, 100000);

        Student student1 = new Student("Suhaib", 30, 'M', 321,"SDET");


        System.out.println(developer1);
        developer1.work();


        System.out.println(tester1);
        tester1.work();
        

        System.out.println(teacher1);
        teacher1.work();

        System.out.println(student1);
        student1.study();

        System.out.println("--------------------------------------------");
        
        tester1.eat();
        tester1.drink();
        tester1.sleep();

        System.out.println("--------------------------------------------");

        teacher1.eat();
        teacher1.drink();
        teacher1.sleep();


        System.out.println("--------------------------------------------");

        student1.eat();
        student1.drink();
        student1.sleep();


        developer1.setAge(42);
        System.out.println(developer1.getAge());
        System.out.println(developer1);

    }




}
/*
7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */