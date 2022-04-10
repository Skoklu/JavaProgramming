package day37_Inheritence.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {     //ScrumTeam IS NOT A relationship with

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers =new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }
    public void addTesters(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester []testers){
        this.testers.addAll(Arrays.asList(testers));  //in this line, the first testers is representing at line12 testers


    }

   public void removeTester(int id){     //p is representing each tester
        testers.removeIf(p-> p.id == id);
   }

   public void addDeveloper(Developer developer){
        developers.add(developer);    //developers represent the developers in line13
   }

   public void addDevelopers(Developer[]developers){
        this.developers.addAll(Arrays.asList(developers));
   }

   public void removeDeveloper (int id){
        developers.removeIf(p-> p.id ==id);  //p represents each developer
   }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
/*
8. Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers


 */