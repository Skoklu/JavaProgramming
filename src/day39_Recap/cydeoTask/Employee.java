package day39_Recap.cydeoTask;

public class Employee extends Person{

    private int id;
    private String jobTitle;
    private  double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isEmpty()||jobTitle.isBlank()){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("Invalid entry");
            System.exit(1);
        }
        this.salary = salary;
    }

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
    }

    public void work(){
        System.out.println(jobTitle+" "+ getName()+ " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age='" + getAge()+ '\'' +
                ", gender='" + getGender() + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()





 */