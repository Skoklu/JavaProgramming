package day37_Inheritence;

class A{
    public A(int a){  //if the parent class was default class you won't create super keyword it will create automaticly
        // if you give parameter here (linking line line10)
        System.out.println("A");
    }
}
class B extends A{
    public B(){
        super(9);  //you have to create super keyword manually here (linking line line4)
        System.out.println("B");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {

        B obj = new B();

    }


}
