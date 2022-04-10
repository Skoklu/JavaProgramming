package day31_Constructors;

public class Person {


    //We have three INSTANCE VARIABLE
    public String name;
    public char gender;
    public int age;


    //one CONSTRUCTOR with three parameters
    public Person(String name, char gender, int age){
        this.name = name;
        this.gender= gender;
        this.age = age;


    }
//AND WE have three toSTRING method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

}
