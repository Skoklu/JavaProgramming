package day37_Inheritence.animalTask;

public class Parrot extends Animal{



   // public String parrotWingColor;  //specific variable
//if you use setInfo instead of super you have to call them one by one
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    //this.parrotWingColor = parrotWingColor;
}
    public void sing(){
        System.out.println(name+ " is singing");
    }
}
