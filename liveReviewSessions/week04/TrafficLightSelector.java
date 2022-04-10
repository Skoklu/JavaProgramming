package week04;

public class TrafficLightSelector {

    public static void main(String[] args) {

        char color ='T';
        switch (color){
            case'R':
                System.out.println("Red light");
                break;
            case'O':
                System.out.println("Orange light");
                break;
            case'G':
                System.out.println("Green light");
                break;
            default:
                System.out.println("Invalid Light");

        }
    }
}
