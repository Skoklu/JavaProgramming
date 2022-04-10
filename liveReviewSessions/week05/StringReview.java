package week05;

public class StringReview {

    public static void main(String[] args) {

        String str = "Java";  //literal way of creating

        String str2 = "Java";
        System.out.println(str == str2);  //true

        String str3 = new String("Java");
        System.out.println(str2 == str3); //false


        //What does equals () method do? it is checking for the value of the object

        System.out.println(str2.equals(str3));

        String str4 = new String("JAVA");

        System.out.println(str2.equalsIgnoreCase(str4));


    }
}
