package day37_Inheritence.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);
    }

    public void gather(){
        System.out.println(name + " is gathering US");
    }
}
/*
6. Create a sub class of EMployee named ProductOwner:

			Add any extra variable or method that ProductOwner object need to have

 */