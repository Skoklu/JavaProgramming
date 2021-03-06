package day51_Map;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        //    Key  ,  Value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(6, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(5, "Ahmet");
        hashMap.put(7, "null");
        hashMap.put(8, "null");
        hashMap.put(9, "null");
        hashMap.put(null, "Cihad");
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");
        

        System.out.println("hashMap = " + hashMap);

        System.out.println(hashMap.get(40));  //Map does not have index number but you can call it by using key
        

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(6, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Hulya");
        linkedHashMap.put(null, "Selen");
        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>();  //Key not be null, value can be null and duplicated
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(6, "Ahmet");
        treeMap.put(5, "Isabella");
        treeMap.put(7, null);
        //treeMap.put(null, "Hulya");  //treeMap does not accept null value
        
        System.out.println("treeMap = " + treeMap);
        

        Map<Integer, String> hashTable = new Hashtable<>();  //Key and value can not be null
        hashTable.put(10, "Arthur");
        hashTable.put(20, "George");
        hashTable.put(3, "Jack");
        hashTable.put(40, "Emma");
        hashTable.put(6, "Ahmet");
        hashTable.put(5, "Isabella");
        //hashTable.put(null, "Hulya");  //hashMap does not accept null value

        System.out.println("hashTable = " + hashTable);


        //String str = null;

        //System.out.println(str.toUpperCase());




    }
}
/*
browser: chrome
URL:
username: cydeo
password: 123
 */
