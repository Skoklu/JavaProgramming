package day35_Encapsulation.encapsulation;

public class Person {

    // we don't give any condition here
    private String name;

    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){  //don't use String after void
        this.name =name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        //Only we give if condition here
        if (age <=0|| age >=150){
            System.err.println("Invalid age: "+ age);
            System.exit(0);
        }
        this.age =age;
    }
}
