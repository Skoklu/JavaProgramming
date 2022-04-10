package day34_GarbageCollection_AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {


        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
       // System.out.println(AccessModifiers.privateData); //private is not eligible the access --->
        // and not visible the outside of the class

        AccessModifiers.method1();
        AccessModifiers.method2();
        //AccessModifiers.method3();//private is not eligible the access --->
        // and not visible the outside of the class

    }
}
