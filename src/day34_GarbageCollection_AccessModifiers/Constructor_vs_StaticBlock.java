package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block");  //firstly this will be executed
    }
    public Constructor_vs_StaticBlock(){  //this is not executed, because it needs an object
        System.out.println("Constructor");
    }

    public static void main(String[] args) {  //secondly this will be executed
       new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }
}
