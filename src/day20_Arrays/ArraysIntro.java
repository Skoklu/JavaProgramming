package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {


        //Create a variable that's capable to contain 5 names

        String []myGroup = new String[5];  //0~ 4
        myGroup [0]= "Gunay";
        myGroup[1]= "Neira";
        myGroup[2]= "Mikail";
        myGroup[3]="Suat";
        myGroup[4]="Hulya";

       // myGroup[5]="Muhtar";  gives error on the console, because it is more than 5
       // myGroup[-3]="Adam";   gives error on the console, because it is negative number


        //System.out.println(myGroup);  //hashcode
        System.out.println(Arrays.toString(myGroup)); //["Gunay", "Neira", "Mikail", "Suat", "Hulya"]

        System.out.println("-----------------------------------------");

    }




}
