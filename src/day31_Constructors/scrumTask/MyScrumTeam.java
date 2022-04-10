package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //create 3 tester objects
        Tester tester1 = new Tester("Layan",11,"QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Alex", 44, "SE", 135000);
        Tester tester4 = new Tester("Lala", 23, "SDET", 115000);

        Tester [] testers= {tester1, tester2, tester3, tester4};

        //create 4 developer objects
        Developer developer1 = new Developer("Olga", 20,
                "Java Developer", 125000);
        Developer developer2 =new Developer("Aygun", 39,
                "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28,
                "Software Developer", 135000);
        Developer developer4 = new Developer("Sinem", 33,
                "Senior Developer", 200000);

        Developer [] developers ={developer1, developer2, developer3, developer4};

        //1 ScrumTeam object

        ScrumTeam scrum =new ScrumTeam("Nigara","Huseyin", "Neira",14);

       // scrum.addTester(tester1);
       // scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("-----------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name+" : "+eachTester.salary);

        }

        System.out.println("-----------------------------------------------------");


        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary);

        }

        System.out.println("--------------------------------------------------------");

        scrum.removeTester(23);
        scrum.removeDeveloper(33);

        System.out.println(scrum);


    }
}
