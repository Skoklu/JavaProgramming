package day09_IfStatement;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100,
            n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 <n1;
        boolean equal = n1 == n2;

        /*
        second method: if(n1 < n2){
        System.out.println(n1+ "is the minimum number");
         */

        if (n1IsMin){  //if n1 is minimum number
            System.out.println(n1+ " is the minimum number");
        }
        if (n2IsMin) {  //if n2 is minimum number
            System.out.println(n2 + " is the minimum number");
        }

        if (equal){    //if n1 is equal n2
            System.out.println("Equal");
        }
    }
}
/*
if & else: when there are only two option/possibilities ( not more not less than 2 condition)


		if(Condition){
			StatementA
		}else{ // otherwise
			StatementB
		}

		StatementA: if condition MUST be true
		StatementB: if condition MUST be false


		Yes or No
		Leap year
		Female or Male
		Pass or Fail
		Married or not Married
		employeed or not employeed
		Odd or Even
		Enligible or not eligible

 */