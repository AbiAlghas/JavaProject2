import java.util.Arrays;

//Check if Two Strings are Anagrams: Given two strings, determine if
//they are anagrams, meaning they contain the same characters in a
//different order. For example, "listen" and "silent" are anagrams.
public class Anagrams {
    public static void main(String[] args) {
        String word1="listen";
        String word2="silent";

        char[] c1= word1.toCharArray();
        char[] c2= word2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isAnaGram=Arrays.equals(c1,c2);


            System.out.println(isAnaGram);
        }
    }

