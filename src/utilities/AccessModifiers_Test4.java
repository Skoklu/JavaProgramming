package utilities;

import day40_FinalKeyword.ProtectAccessModifier;

public class AccessModifiers_Test4 extends ProtectAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1);  //not visible because it is default access modifier
        System.out.println(AccessModifiers_Test4.name2);  //protected is visible outside the package

        //AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();
    }
}
