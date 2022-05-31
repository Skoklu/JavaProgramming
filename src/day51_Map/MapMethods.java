package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


        //student name & score
        //"put()" method

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);
        
        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);
        
        

        System.out.println(students);   //result: {}

        //  "size()" method
        System.out.println(students.size());   //result: 0


        //  display the score of Alex:
        //  "get()" method
        System.out.println(students.get("Alex"));


        // replace Ali' score to 90
        //  "replace()" method
        students.replace("Ali", 90);
        System.out.println(students);


        //"remove()" method
        students.remove("Alex");
        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);


        //  "contains()" method
        boolean isContain = students.containsKey("Muhtar");
        boolean isContain2 = students.containsKey("Serkan");
        System.out.println(isContain);
        System.out.println(isContain2);


        //"containsValue()" method
        boolean isContainsValue = students.containsValue(97);
        System.out.println(isContainsValue);


        //"isEmpty()" method
        System.out.println(students.isEmpty());


        //"equals()" Method
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));


        // "clear()" method
        map1.clear();
        map2.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);


        //"keySet()" method





    }
}
