package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

//if we write constructor by manually myself, Then I don't need to write it this line extra //* Person person1 = new Person();*


       // Person person1 = new Person();
        // person1.setInfo("Daniel", 'M', 32);I don't need to write this separate line, because I created constructor by manually
        Person person1 = new Person("Daniel", 'M', 32);
        Person person2 = new Person("Kseniia", 'F', 28);


        System.out.println(person1 +" \n"+ person2);


    }
}
