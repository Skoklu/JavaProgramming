package week06;

import java.util.Scanner;

public class EncryptedPassword {

    public static void main(String[] args) {

        String password = "cydeo";

        char encryptWithChar = 'x';

        String encryptedPassword = "";

        for(int i = 0; i < password.length() ; i++){
            // i stands for index of password string
            encryptedPassword += ""+password.charAt(i)+encryptWithChar;  // String + char + char = String
        }

        System.out.println("encryptedPassword = " + encryptedPassword);

    }
}
