package day35_Encapsulation;

public class CydeoStudent {


    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String secretCode;
    public static String programmingLanguage;


    public CydeoStudent(String name, char gender, int batchNumber,
                        int groupNumber, String fieldOfStudy, int secretCode) {
        this.name = name;
        this.gender = gender;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;

    }

    static {
        schoolName ="Cydeo School";
       secretCode= "Wooden Spoon";
        programmingLanguage ="Java";
    }



    public static void printSchoolName(){
        System.out.println("School Name = " + schoolName);
    }
    public static void printSecretCode() {
        System.out.println("Secret code is: "+secretCode);

    }
    public static void  programmingLanguage(){
        System.out.println("Programming language is: "+programmingLanguage);
    }
    public void attendClass(){
        System.out.println(name+ " is attending class.");
    }public void study (){
        System.out.println(name+ " is studying.");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", secretCode=" + secretCode +
                '}';
    }



}
	/*2. create a class named CybertekStudent
        Variables:
        name, gender, age, batchNumber, groupNumber, schoolName,
         fieldOfStudy, programmingLanguage, secretCode

        Add a constructor to initialize all the fields

        Add a static block to initialize all the statics

        methods:
        printSchoolName();
        printSecretCode();
        attendClass():
        study()
        toString()

	 */


