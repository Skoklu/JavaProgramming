package day36_Inheritance.animalTask;

public class Animal {

    //6 variables are belongs
        public String name, breed;
        public char gender;
        public int age;
        public String size;
        public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    //6 methods are belongs
    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking");
    }

    public void move(){
        System.out.println(name+ " is moving");
    }

    public void sleep(){
        System.out.println(name+ " in sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()


	Dog extends Animal:
			bark()

	Cat extends Animal:
			scratch()

	Tiger extends Animal:
			roar()

	Fish extends Animal:
			swim()

	...

 */