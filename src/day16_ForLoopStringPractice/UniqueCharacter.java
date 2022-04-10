package day16_ForLoopStringPractice;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {  //i < str.length() or i <= str.length we can use one of them

           char ch = str.charAt(i); // ch: each characters of str

           if (str.indexOf(ch) == str.lastIndexOf(ch)){  //if the first and last index numbers of the characters are same
               // is the character is unique

               result += ch;
            }
        }

        System.out.println(result);





    }
}
/*
3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

                Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique

                    indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */