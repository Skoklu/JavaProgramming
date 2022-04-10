package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = "CAt cat caT cAT CAT dog DOG DOg dOG doG ";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) {

            String wordSubs = str.substring(i, i+3);

            if (wordSubs.equalsIgnoreCase("cat")){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
