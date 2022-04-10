package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana",'F',25, 110000);

        employee1.setAge(34);


        Employee employee2 = new Employee("Tahir",'B',100,100000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary() + 15000);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
