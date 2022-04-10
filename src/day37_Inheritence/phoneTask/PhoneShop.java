package day37_Inheritence.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone12", "6.7 Inches",10000,"Black");

        Samsung samsung = new Samsung("Galxy S19", "6 Inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 Inches", 50, "Grey");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(789564213);
        iphone.faceTime("yahoo@gmail.com");


        System.out.println("--------------------------------");

        samsung.call(911);
        samsung.text(1234356756);
        samsung.freeze();

        System.out.println("---------------------------------------");

        nokia.call(323456778);
        nokia.text(12345577);
        nokia.selfDefense();

        System.out.println("-------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(iphone.hasBattery);
        System.out.println(samsung.hasBattery);
        System.out.println(nokia.hasBattery);
    }


}
