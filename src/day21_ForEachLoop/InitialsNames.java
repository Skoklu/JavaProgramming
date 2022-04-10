package day21_ForEachLoop;

public class InitialsNames {

    public static void main(String[] args) {

        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Sinem Kaya",
                "Ruveyda Durna", "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each:names){
            String initial = each.charAt(0)+ "."+each.charAt(each.indexOf(" ")+1);

            System.out.println(initial);
        }



    }
}
