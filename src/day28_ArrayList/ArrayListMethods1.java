package day28_ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        //                index number
        numbers.add(10);  //0
        numbers.add(20);  //1
        numbers.add(30);  //3
        numbers.add(40);  //4
        numbers.add(50);  //6
        numbers.add(60);  //7
        numbers.add(2,25);   //25  //index is: 2
        numbers.add(5,45);   //45  //index is: 5

        System.out.println(numbers);

        System.out.println(numbers.size());  //8

        int lastIndex = numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);
        System.out.println("num = " + num);

        System.out.println("----------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i)+" ");


            System.out.println("-----------------------------------------------");

            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("C#");
            list.add("Java");
            list.add("Ruby");

            list.set(2,"JavaScript"); //set meaning is like replace
            list.set(3,"C++");
            System.out.println("list = " + list);


            System.out.println("-----------------------------------------------");

            ArrayList<String> employees = new ArrayList<>();

            employees.add("Suat");
            employees.add("Aygun");
            employees.add("Olga");
            employees.add("Neira");
            employees.add("Ali");
            employees.add("Hulya");
            employees.add("Kaloyan");

            System.out.println(employees);

            employees.remove(0);
            System.out.println(employees);

            employees.remove(0);
            System.out.println(employees);

            employees.remove(0);
            System.out.println(employees);

            employees.remove(1);  //we give index number
            System.out.println(employees);

            employees.remove(employees.size()-1);  //we give index number
            System.out.println(employees);

           employees.remove("Hulya");  //we give object's name
            System.out.println(employees);

            boolean r1 =  employees.remove("Neira");
            System.out.println(employees);

            System.out.println(r1);

        }


    }
}
