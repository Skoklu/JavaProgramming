package day23_CustomMethods_Void;

    public class CustomMethodsWithParameters {

        public static void main(String[] args) {

        // oddOrEven();  //the method demands additional information to complete task
        oddOrEven(10);

            System.out.println("---------------------------------------");

        ageOfPerson(1974);

            System.out.println("-----------------------------------------");

            allNumbers(50,100);
    }

    //create a function that can check if a number is odd or even number

        public static void oddOrEven(int number){  //10

        if (number % 2 == 0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+ " is odd number");
        }
    }


    // create a function that can display the age of the person

        public static void ageOfPerson(int birthYear){

            int age = 2022 - birthYear;

            System.out.println("Your age is "+ age);
        }

        //                                                        10    50
        //create a function that can print all the numbers between x and y

        public static void allNumbers (int x, int y){


            for (int i = x; i <=y ; i++) {

                System.out.print(i+" ");


            }


        }
}










