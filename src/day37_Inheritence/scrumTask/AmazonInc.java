package day37_Inheritence.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String companyName ="Amazon Inc";

        ProductOwner po =new ProductOwner("Suhaib", 29, 'M', 1, 160000,companyName);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, companyName);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, companyName);

        Tester tester1 = new Tester("Chinara", 32, 'F',
                "QA", 1415, 125000, companyName);
        Tester tester2 = new Tester("Yasaman",32 , 'F',
                "QE",1416 ,130000 , companyName);
        Tester tester3 = new Tester("Irena",29 , 'F',
                "SDET",1417 ,128000 , companyName);
        Tester tester4 = new Tester("Cihad",26 , 'M',
                "QA", 1418, 125000, companyName);

        Tester []testers= {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Dainela", 27, 'F',
                "Java Developer", 8, 135000, companyName);

        ScrumTeam scrumTeam =new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + " : "+ tester.salary);
        }
        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);

        }
    }
}
