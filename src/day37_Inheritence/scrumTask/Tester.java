package day37_Inheritence.scrumTask;

public class Tester extends Employee{  //Tester IS A Employee,  Tester IS A Person

    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }
    public void createTicked(){
        System.out.println(jobTitle+" "+name+" is creating ticked.");
    }
}
/*
3. Create a sub class of Employee named Tester:

			Add any extra variable or method that Tester object need to have

 */