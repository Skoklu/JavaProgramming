package day40_FinalKeyword;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, String colour, String size, int age) {
        super(name, breed, gender, colour, size, age);
    }

    public void eat(){
        System.out.println(getName()+ " is eating dog food");
    }
   /*
    public void drink(){   //final method can not be overrided

        System.out.println(getName()+" is drinking water");
    }

    */

    public void  bark(){
        System.out.println(getName()+" is barking");
    }
}
