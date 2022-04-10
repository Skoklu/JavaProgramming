package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";


        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 2,'M',
                "Large","Black");

        dog1.eat();
        dog2.bark();


        Dog dog4 = new Dog();
        dog4.setInfo("Bulled", "Labrador", 3, 'M', "Extra Large", "Yellow");


        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6,'M',
                "Large", "Black");
        /*
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

         */


        System.out.println("------------------------------------------------------------");

        Dog [] dogs = {dog1, dog2, dog3, dog4, dog5};
        for (Dog dog : dogs) {
            System.out.println(dog);

        }
        System.out.println("------------------------------------------------------------");

        ArrayList<Dog> maleDogs = new ArrayList<>();
        ArrayList<Dog> femaleDogs = new ArrayList<>();


        for (Dog dog : dogs) {
            if (dog.gender == 'M') {
                maleDogs.add(dog);
            }else {
                femaleDogs.add(dog);
            }

        }

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);

    }
}
