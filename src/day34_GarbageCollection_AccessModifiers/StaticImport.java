package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;
public class StaticImport {

    public static void main(String[] args) {

        //System.out.println(Circle.pi);  //only first time we call class name  //we can delete it
        System.out.println(pi);  //then we don't need to call again


    }
}
