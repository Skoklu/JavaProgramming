package day31_Constructors;

public class Offer {

    //Instance Variables
    public String location, companyName, jobTitle;
    public double salary;
    public boolean hasBenefits, hasPTO, isWFH, isFullTime;
    //Pay Time Off
    //Work From Home

//firstly we will see the class name( Offer) then we will change it into void setInfo
    public void setInfo(String location, String companyName, String jobTitle, double salary,
                 boolean hasBenefits, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;


    }


    //If you don't put toString Method you will get hash code
    //Note: toString Method is has executed every time you pass the object to upper class -->
    // in the print statement
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefits=" + hasBenefits +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
      warmup tasks:
	Offer Task:
		1. Create a custom class named Offer
				Attributes:
						location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

				Actions:
					setInfo(): sets all the instance variables
					toString(): returns the full info of the Offer Object


 */