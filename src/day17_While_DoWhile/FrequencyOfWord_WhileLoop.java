package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {
        String  str = "Java Java Python Python";
        int frequency = 0;
        while (str.contains("Java")){

            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("------------------------------");

        String sentence = "cat cat cat cat  dog dog dog dog cAT Cat cat";
        sentence = sentence.toLowerCase();

        int countCat = 0;

        while (sentence.contains("cat")){

            sentence =sentence.replaceFirst("cat","");

            countCat++;

        }
        System.out.println(countCat);

        System.out.println("-----------------------------------------");

        String s = "Java Java Java Java python python python ";
        int countJava = 0;
        int countPython = 0;

        while (s.contains("Java")|| s.contains("python")){  //Also you can open 2 "while" loop.

            if (s.contains("Java")){
                s = s.replaceFirst("Java", "");
                countJava++;
            }
            if (s.contains("python")){
                s = s.replaceFirst("python", "");
                countPython++;


            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }
}
