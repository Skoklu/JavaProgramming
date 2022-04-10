package day37_Inheritence.scrumTask;

public class ScrumMaster extends Employee{  //Scrum Master IS A Employee,  Scrum Master IS A Person


    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }
    
    public void meet(){
        System.out.println(jobTitle+" "+name+ " is meeting");
    }
}
/*

	7. Create a sub class of EMployee named ScrumMaster:

			Add any extra variable or method that ScrumMaster object need to have

 */