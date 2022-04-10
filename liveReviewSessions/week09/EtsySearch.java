package week09;

public class EtsySearch {

    public static void main(String[] args) {
        System.out.println("--Starting UIAutomation testing for Etsy Website---");

        openBrowser("Chrome");
        navigateToUr("https://www.etsy.com");
        searchForItem("Java");
        if (verifyItemDisplayed().equals("PASS")) {
            System.out.println("Your Test Case Passed");
        } else {
            System.out.println("Failed Test Case Scenario");
        }
    }
    public static void openBrowser(String browser){  //chrome, firefox, edge, safari.......

        System.out.println("Launching "+ browser+" browser");
    }

    public static void  navigateToUr(String url){
        System.out.println("Navigating to "+url);
    }

    public static void searchForItem(String item){
        System.out.println("PASS: verify "+item+" exist");
        System.out.println("Click on that "+item);
    }

    public static String verifyItemDisplayed(){
        String result ="PASS";
        return result;
    }
}
