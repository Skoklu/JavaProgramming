package day40_FinalKeyword;

public class zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky", 'M',"White","Large",5);
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
    }
}
