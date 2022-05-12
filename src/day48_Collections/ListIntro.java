package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {


        //When we use the get method ArrayList is the fastest //or accessing the element Array is fastest
        List<Integer> list1 = new ArrayList<>();  //polymorphism
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list1.get(0));

        //Inserting or deleting LinkedList is fastest
        List<Integer> list2 = new LinkedList<>(); //
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list2.get(0));


        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list3.get(0));


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));
        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop();  //10, 20, 30, 40, 50
        System.out.println(list4);

        System.out.println("-------------------------------------------");


        ((Stack) list4).pop();   //10, 20, 30, 40
        System.out.println(list4);



    }
    public synchronized void method1(){

    }

}
