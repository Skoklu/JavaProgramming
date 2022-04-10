package day37_Inheritence.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 =new Dog("Alex", "Husky",'M', 1, "Small","White");

        System.out.println(dog1);

        dog1.bark();
        dog1.eat();
        dog1.drink();
        dog1.move();
        dog1.sleep();
       // dog1.scratch();
        //dog1.sing();

        System.out.println();

        Cat cat1 =new Cat("Love", "Siamese",'F',2, "Large", "Black");

        System.out.println(cat1);
        cat1.scratch();
        cat1.eat();
        cat1.drink();
        cat1.move();
        cat1.sleep();
       // cat1 .bark();
       // cat1.sing();

        System.out.println();

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Blue");

        System.out.println(parrot1);
        parrot1.sing();
        parrot1.eat();
        parrot1.drink();
        parrot1.move();
        parrot1.sleep();
       // parrot1.scratch();
       // parrot1.bark();

    }
}
