package day_Collections_Map;

import java.util.*;

public class ListSetPractice {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

        System.out.println(set);

       //Integer[]list = set.toArray(new Integer[0]);

       List<Integer> list = new ArrayList<>(set);

        System.out.println(list);

        List<String> names1 = null;
        // System.out.println(names.size());

        System.out.println("--------------------------------------------------");

        // pop()===>LIFO  (It is used Only in Stack Class)  //Last one will remove

        List<Character> chars = new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));

        System.out.println("chars = " + chars);  //[A,B,C,D]

       ((Stack)chars) .pop();
        System.out.println("chars = " + chars);  //[A,B,C]

        //poll()===>FiFO  (It is used in Queue Collection type)  //First one will remove


        List<String> names2 = new LinkedList<>();
        names2.addAll(Arrays.asList("James","Jimmy", "Kathy", "Breanna", "Max" ));

        ((LinkedList<String>)names2).poll();

        System.out.println(names2);





    }
}
