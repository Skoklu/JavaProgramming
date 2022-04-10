package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39,2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

       Student student3 = new Student();
       student3.setInfo("Elminur", 'F', 26, 2210,'A');

       Student student4 = new Student();
       student4.setInfo("Ali", 'M', 28, 5511, 'B');

       Student student5 = new Student();
       student5.setInfo("Mert", 'M', 26, 2252, 'C');

       Student []students ={student1, student2, student3, student4, student5};

        ArrayList<Student> earlyBird = new ArrayList<>(); //grade: 'A'
        ArrayList<Student> angryBird = new ArrayList<>();  //grade: 'B', 'C'

        for (Student each : students) {
            if (each.grade =='A') {
                earlyBird.add(each);
            }else {
                angryBird.add(each);
            }



        }

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("angryBird = " + angryBird);


/*
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);

 */
    }
}
