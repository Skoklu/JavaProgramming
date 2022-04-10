package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {  //outer class  //we don't use static outer class

    static class class1{  //this is the nested class   //inner class  //we can use static only inner class

    }

    public static int num = 100;  //variable can be static

    public static void method(){  //Method can be static
    }
    static {  //block can be static

    }
}
class A{  //outer class

    static class B{  //inner class
    public static void method1(){

    }
    }
}class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}

class x{
}
class y{

}
class z{
    static class q{

    }
}



//class does not have any memory