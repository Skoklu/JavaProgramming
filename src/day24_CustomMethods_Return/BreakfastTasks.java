package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("hello","world");

        System.out.println("-------------------------------------------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("----------------------------------------------------");

        String [] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain (email);

        }

        System.out.println("----------------------------------------------------");
        nameOfMonth(11);

        System.out.println("--------------------------");

        nameOfDay(4);

        System.out.println("--------------------------------------------------");

        daysOfMonth(7);

        System.out.println("-----------------------------------------------------");

        ageGroups(9);



    }
    //1. Create a method that can display the initials of the person   initials(String firstName,String lastName)

    public static void initials(String firstName, String lastName){

        String initial = firstName.toUpperCase().charAt(0)+"."+lastName.toUpperCase().charAt(0);
        //  OR initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }


    //2. Create a method that can display the domain of the email.    domain(String email)
    public static void domain(String email){    //Cydeo.School@gmail.com

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = "+domain);


    }


    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number) {

        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" :
                    (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" :
                            (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" :
                                    "December";

        } else{
            name="invalid";
        }

        System.out.println("Name of the month is: "+name);
    }


   // 4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){

        String name ="";

        if (number >=1 && number <=7){
            name= (number ==1)? "Monday" :(number ==2)? "Tuesday" :(number ==3)? "Wednesday"
                    :(number ==4)? "Thursday" :(number ==5)? "Friday" :(number ==6)? "Saturday" :"Sunday";

        }else{
            name="invalid";


        }
        System.out.println("Today is: "+name);
    }

//5. Create a method that can print how many days a month has

    public static void daysOfMonth(int number){

        int numOfD =0;
        int year = 0;
        switch (number){

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numOfD= 31;
                break;

            case 4: case 6: case 9: case 11:
                numOfD = 30;

            case 2:
                if (year % 4 != 0){
                    numOfD=28;
                }else {
                    numOfD =29;
                }

        }
        System.out.println( "Days Of Month is: "+numOfD);
    }

        public static void ageGroups(int age) {

            String citizenGroup = "";


            if (age >= 1 && age <= 2) {
                citizenGroup = "Infant";
            } else if (age >= 3 && age <= 5) {
                citizenGroup = "Toddler";
            } else if (age >= 6 && age <= 9) {
                citizenGroup = "Kid";
            }else if (age >= 10&& age <= 12){
                citizenGroup = "Pre-Teen";

            }else if (age >= 13&& age <= 17){
                citizenGroup = "Teenager";

            }else if (age >= 18&& age <= 20){
                citizenGroup = "Young Adult";

            }else if (age >= 21&& age <= 39){
                citizenGroup = "Adult";

            }else if (age >= 40&& age <= 49) {
                citizenGroup = "Young Middle-Aged Adult";

            }else if (age >= 50&& age <= 54){
                    citizenGroup = "Middle-Aged Adult";
            }
            else if (age >=55 && age <= 64){
                citizenGroup = "Very Young Senior Citizen";

            }else if (age >= 65&& age <= 74){
                citizenGroup = "Young Senior Citizen";

            }else if (age >= 75&& age <= 84){
                citizenGroup = "Senior Citizen";

            }else if (age >84){
                citizenGroup = "Old Citizen";

            }else{
                citizenGroup= "Invalid";
            }

            System.out.println( "Age group is: "+citizenGroup);
            }


        }

/*
1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

    6. ageGroups:
                age group are:
                            Infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12), Teenager (13 - 17),
                            Young Adult (18  - 20), Adult (21 - 39), Young Middle-Aged Adult (40 - 49),
                            Middle-Aged Adult (50 - 54), Very Young Senior Citizen (55 - 64),
                            Young Senior Citizen (65 - 74), Senior Citizen (74 - 84),
                            Old Senior Citizen (85+)


 */