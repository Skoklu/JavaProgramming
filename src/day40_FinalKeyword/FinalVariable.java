package day40_FinalKeyword;

public class FinalVariable {

    final String birthday; // only I can execute this variable by using constructor
    final static String name;  //I can get rid of compiler error by using static block

    static {
        name="BatchEU8";
    }




    public FinalVariable(String birthday) { // when I create this constructor compiler error gone in line 5
        this.birthday = birthday;
    }

    public final static void main(String[] args) {

        final double pi = 3.14;

        //pi = 4.14;  // final variables can not be reassigned

        final String name;

        name ="Java";

       // name = "wooden Spoon";

        System.out.println(name);

        System.out.println("----------------------------------------------");

        FinalVariable obj = new FinalVariable("May/01/1990");
       // obj.birthday = " June/ 01/99";   //final variables can not be reassigned
        System.out.println(obj.birthday);

        System.out.println("--------------------------------------------");

       // FinalVariable.name = "Python";   //I don't reassign this because it is final
        System.out.println(FinalVariable.name);

    }


}
