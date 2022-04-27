package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id,  double salary) {
        super(name, age, gender, id, "Tester", salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+ " "+getName() + " is testing codes and creating ticked ");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is testing application and creating ticked");
    }

}
/*
3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()


 */