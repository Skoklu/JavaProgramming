package day44_Abstraction.animalTask;

public interface Playable {

     boolean isFriendly = true;   //static and final by default

     /*
     public static void method1(){
          System.out.println(isFriendly);
     }

      */

     void play(); //abstract by default

     //we don't need to use public abstract,
    // because we created as a public, and we use interface for abstraction in line 3
}
