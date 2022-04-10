package week05;

public class DynamicSubstring {

    public static void main(String[] args) {

      String searchResult = "result count:12345";
                           //0123456789.......
        //substring method : it takdes index location of the char, returns you a new string
        System.out.println(searchResult.substring(13)); // takes the beginning index then rest of the string
        System.out.println(searchResult.substring(13,18));//12345

        System.out.println(searchResult.indexOf(":"));  //12

        int colonIndex = searchResult.indexOf(":");
        System.out.println(searchResult.substring(colonIndex+1));
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));
        String newSearchResult = searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println("newSearchResult = "+ newSearchResult);



        String searchResultTwo = "usarname: oscar search result count:12345 more colon : more ";
        int firstColon = searchResultTwo.indexOf(":");
        System.out.println("first colon: "+firstColon);
        int secondColon = searchResultTwo.indexOf(":", firstColon+1);
        System.out.println("secondColon = " + secondColon);
        System.out.println(searchResultTwo.substring(secondColon+1,secondColon+6));

        System.out.println(searchResultTwo.substring(secondColon+1, secondColon+6));


        /*String today = "I coded a lot of [java] today";//imagine that inside square brackets is dynamic
        //Get me the word inside brackets using indexOf and substring method
        String word = today.substring(today.indexOf("[" +1, today.indexOf("]")));
        System.out.println("word = " + word);

         */



    }
}
