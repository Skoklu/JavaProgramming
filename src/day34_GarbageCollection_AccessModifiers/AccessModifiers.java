package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;  //Access Modifiers

    static int defaultData = 200; //Access Modifier: default

    private static int privateData = 300;


    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("default");
    }
    private static void method3(){

    }

    public static void main(String[] args) {

        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);
    }
}
