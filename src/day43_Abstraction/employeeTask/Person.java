package day43_Abstraction.employeeTask;

public abstract class Person {

    private String name;
    private int age;
    private char gender;


    //Constructor
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    //3 getters and 3 setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new RuntimeException("Invalid entry");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0){
            throw new RuntimeException(age + " is invalid enter");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender =='F')){
            throw new RuntimeException(gender + " is invalid entry");
        }
        this.gender = gender;
    }

    //Abstract Method
    public abstract void sleep();


    //Instance Method
    public void eat(){
        System.out.println(name+ " is eating baklava");
    }


    //to String Method
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Employee task:
		abstract Person:
			name, age, gender(final)

			eat();
			sleep();




 */