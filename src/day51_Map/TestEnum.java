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

                System.out.println("------------------------------------------------------");


        }

        Level level = Level.EASY;

        switch (level){

            case EASY:
                System.out.println("Level is Easy");
                break;

            case MEDIUM:
                System.out.println("Level is Medium");
                break;

            case HARD:
                System.out.println("Level is Hard");
                break;

            case EXPERT:
                System.out.println("Level is Expert");
                break;

            case ADVANCED:
                System.out.println("Level is Advanced");
                break;

            default:
                System.out.println("Level is Chuck_Norris");
        }

        Month month = Month.JANUARY;

        switch (month){
            case JANUARY:
                System.out.println("Month is January");
                break;

            case FEBRUARY:
                System.out.println("Month is February");
                break;

            case MARCH:
                System.out.println("Month is March");
                break;

            case APRIL:
                System.out.println("Month is April");
                break;

            case MAY:
                System.out.println("Month is May");
                break;

            case JUNE:
                System.out.println("Month is June");
                break;

            case JULY:
                System.out.println("Month is July");
                break;

            case AUGUST:
                System.out.println("Month is August");
                break;

            case SEPTEMBER:
                System.out.println("Month is September");
                break;

            case OCTOBER:
                System.out.println("Month is October");
                break;

            case NOVEMBER:
                System.out.println("Month is November");
                break;
            default:
                System.out.println("Month is December");
        }

    }
}
