package week02;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*
        name
        company name
        jobTitle
        gender
        salary
        employeeID
        hasBenefits(Y/N)
        isMarried

         */

        String name = "Selma Koklu",
         companyName = "Spring",
           jonTitle = "Manager";
        char gender = 'F';
        double salary = 75000.67;
        String employeeID = "12345667899";
        char hasBenefits = 'N';
        boolean isMarried = true;

        System.out.println( "Name: "+name+ "\n Company Name: "+ companyName+ "\n Job Title: "+ jonTitle+ " \nGender: "
                + gender+ "\nSalary:  "+ salary+"$" +"\nEmployee ID: "+ employeeID+ " \nHas Benefits: "+hasBenefits+ " \n Is Married"+isMarried);








    }
}
