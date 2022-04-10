package day30_CustomClass;

public class Student {

    public String name; //instance variable name
    public char gender;  //instance variable name
    public int age;  //instance variable name
    public int ID;  //instance variable name
    public char grade;  //instance variable name

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    //if you use the same name which are local variable and instance variable you have to use "This. key word"


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';


    }

    public void code() { System.out.println(name + " is coding");
    }
    public void sleep()  {System.out.println(name +" is sleeping");}

}
