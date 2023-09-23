import java.util.ArrayList;

public class StringsstartwithA {
    //You have a list of strings and you want to keep only those that start
    //with “A” and you want to return them in lower case"
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("abi");
        words.add("ayesha");
        words.add("khan");
        words.add("alghas");
        words.add("Toronto");

        for (String s : words) {
            if (s.startsWith("a") || s.startsWith("A")) {
                System.out.println(s.toLowerCase());
            }
        }
    }
}