package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "        batch EU8       ";
        str1 = str1.trim();  //"batch EU8"  // this will create a new String e.g. "batch EU8"

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");   //h

        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ol");  //10
        System.out.println("n2 = " + n2);

        String str3 = "Java programming language";

        int n3 = str3.indexOf("a");   //there isn't any space after a, it is meaning that first a "J(a)va"

        System.out.println("n3 = " + n3);

        int n5 = str3.indexOf("a ");  //there is a space after a, it is meaning that second a "jav(a)"

        System.out.println("n5 = " + n5);


        int n4 = str3.indexOf("am");  //"am" meaning is that the a is  before the m "progr(a)mming"

        System.out.println("n4 = " + n4);

        int n6 = str3.indexOf("an");

        System.out.println("n6 = " + n6);

        int n7 = str3.indexOf("g ");

        System.out.println("n7 = " + n7);

        int n8 = str3.indexOf("gua");
        System.out.println("n8 = " + n8);

        int n9 = str3.lastIndexOf("g");
        System.out.println("n9 = " + n9);

        System.out.println("------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int num1 = s.indexOf("a");
        System.out.println("num1 = " + num1);

        int num2 = s.lastIndexOf("a");
        System.out.println("num2 = " + num2);

        int num3 = s.indexOf("a C");
        System.out.println("num3 = " + num3);

        int num4 = s.indexOf("ava W");
        System.out.println("num4 = " + num4);

        int num5 = s.lastIndexOf("av");
        System.out.println("num5 = " + num5);

        int num6 = s.indexOf("Ca" )+1;
        System.out.println("num6 = " + num6);

        int num7 = s.lastIndexOf("aw");
        System.out.println("num7 = " + num7);

        int num8 = s.lastIndexOf("a ");
        System.out.println("num8 = " + num8);

        int num9 = s.indexOf("r")+1;
        System.out.println("num9 = " + num9);




    }
}
