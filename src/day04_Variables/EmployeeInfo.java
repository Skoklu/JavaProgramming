package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Selma";
        int age = 48;
        char gender = 'F';
        String company = "Spring";
        String jotTitle = "Sales Assistant";
        double yearsOfExperience = 18.9;
        int salary =  55_000;
        boolean isFullTime = true;
        boolean isMarried = true;
        String employeeId = "123-456845";
        String SSN = "452378976";
        //String is non-primitive
        
        


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jotTitle = " + jotTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeId = " + employeeId);
        System.out.println("SSN = " + SSN);



    }
}
  /*
  6. Create a class employeenamed EmployeeInfo. declare the following variables:
				1. employeename (String)
				2. age (int)
				3. gender (char)
				4. company (String)
				5. jobTitle (String)
				6. yearsOfExpereince (double)
				7. salary (int)
				8. isFullTime (boolean)
				9. isMarried (boolean)
				10. employeeId (String)
				11. SSN (String)

   */

/*
primitives:
	int: for integers
	double: for decimals
	char: for single characters, ''
	boolean: true/false


String: sequence of characters (String of text), ""

variable naming rules:
		1. MUST be unique
		2. camelCase
		3. Can Not start with digits
		4. starts with lower case letters
		5. Can Not be Java Reserved words
		6. Can Not have special characters other than _ and $
		7. readable, understandable


How to replace variable names?
		1. Ctrl (Command) + R
		2. type old variable name
		3. type new variable name
		4. click Replace All

 */