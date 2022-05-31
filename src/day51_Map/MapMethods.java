package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


        //student name & score
        //"put(key, value)" method: inserts the given key and value to map

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
        //  "get(key)" method: returns the value of the given key
        System.out.println(students.get("Alex"));


        // replace Ali' score to 90
        //  "replace(key, newValue)" method: replaces the value of the given key with the given new value
        students.replace("Ali", 90);
        System.out.println(students);


        //"remove(key)" method: removes the given key and its value from the map
        students.remove("Alex");
        System.out.println(students);

        students.remove("Ozan");

        System.out.println(students);


        //  "containsKey(key)" method: returns true if the given key is contained in the map, otherwise returns false
        boolean isContain = students.containsKey("Muhtar");
        boolean isContain2 = students.containsKey("Serkan");
        System.out.println(isContain);
        System.out.println(isContain2);


        //"containsValue(Value)" method: returns true if the given value is contained in the map, otherwise returns false
        boolean isContainsValue = students.containsValue(97);
        System.out.println(isContainsValue);


        //"isEmpty()" method:returns true if the size of the map is 0, otherwise returns false
        System.out.println(students.isEmpty());


        //"equals()" Method: returns true if the given map is equal with the current map, otherwise returns false
        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 == map2);
        System.out.println(map1.equals(map2));


        // "clear()" method: removes all the pairs from the map
        map1.clear();
        map2.clear();
        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);








    }
}
