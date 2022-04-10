package day16_ForLoopStringPractice;

public class RemoveDuplicate {

    public static void main(String[] args) {

      String str = "aabbaacc";

      String result = "";  //abc
                        //i <= 7 or i < 8 are same

        for (int i = 0; i <= str.length()-1 ; i++) {  // i: represents the all the index numbers of str (starts from zero)

           String ch = ""+str.charAt(i);  //represents each character of str

           if ( !result.contains(ch)){  // if the character is not contained in the result  -->
               result += ch;  //the character will be added to the result
           }



        }
        System.out.println("result = " + result);

        System.out.println("-----------------------------------------------");
        
        String name = "muhammet ali";
        
        String result2 = "";

        for (int i = 0; i <=name.length()-1 ; i++) {

            String ch = ""+name.charAt(i);

            if (! result2.contains(ch)){
                result2 += ch;
            }
            
        }
        System.out.println(result2);


    }
}
