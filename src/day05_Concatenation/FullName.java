package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Selma";
        String lastName = "Koklu";
        int age = 48;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is .......

        System.out.println("Full name of the person is " + fullName + ".");

        // .....is......years old

        System.out.println(fullName + " is " + age + " years old.");

        System.out.println(fullName + " is "  + jobTitle + "  works at " + companyName
                + ", and  " +fullName+
                "'s salary is $ "+ salary + ".");





    }
}
