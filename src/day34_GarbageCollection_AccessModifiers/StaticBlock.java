package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {


    public static void main(String[] args) {

        System.out.println("Main method");  //forth this executed
    }
    static{  //Runs first before anything and only runs one time, even if you use the loops
        System.out.println("Static Block 1");

    }
    static { //second this executed
        System.out.println("Static Block 2");
    }
    static {  //third this executed
        System.out.println("Static Block 3");
    }
}
