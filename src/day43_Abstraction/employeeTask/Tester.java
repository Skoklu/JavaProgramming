package day43_Abstraction.employeeTask;

public final class Tester extends Employee {

    public Tester(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "Tester", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " sleeps 8 hours");

    }
    public void bugReport(){
        System.out.println(getName()+ " is creating bug reports");
    }
}
/*
Tester
			work(): testing



 */