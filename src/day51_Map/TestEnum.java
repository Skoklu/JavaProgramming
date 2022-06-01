package day51_Map;

public class TestEnum {

    public static void main(String[] args) {

        // String browser = "Wooden Spoon";

        Browser browser = Browser.SAFARI;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case OPERA:
                System.out.println("Opera is selected");
                break;

            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");
        }

        System.out.println("------------------------------------------------------");

        Season season = Season.SUMMER;

        switch (season){

            case SPRING:
                System.out.println("Season is Spring");
                break;

            case SUMMER:
                System.out.println("Season is Summer");
                break;

            case FALL:
                System.out.println("Season is Fall");
                break;

            default:
                System.out.println("Season is Winter");
        }
    }
}
