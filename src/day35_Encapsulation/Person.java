package day35_Encapsulation;

public class Person {

    //String name;  //this is default object you never use it outside the package

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;


    }

    static {  //static block
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
       numberOfWings = 0;

    }

    public static void printPlanetName(){
        System.out.println("Planet name is "+planet);
    }



}
/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */