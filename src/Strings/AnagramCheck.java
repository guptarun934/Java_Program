package Strings;
import java.util.Arrays;

public class AnagramCheck {


   // private static boolean isAnagram = false;
    public static boolean checkAnagram (String first, String second) {
         char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }

    public static void main(String [] args){

        // AnagramCheck ang = new AnagramCheck();

        // System.out.println(ang.Anagrams("army","mary"));
        // System.out.println(ang.Anagrams("stop","pots"));
        boolean res = checkAnagram ("mary","army");
        System.out.println(res);


    }

}


   /* public boolean Anagrams(String str1, String str2){

        if(str1.length() != str2.length()){
            return isAnagram;
        }

        boolean [] char_set = new boolean[256];
        boolean [] char_set1 = new boolean [256];


        for(int i =0;i<str1.length();i++){

            int val1 = str1.charAt(i);
            int val2 = str2.charAt(i);

            char_set[val1] = true;
            char_set1[val2] = true;
        }

        if(Arrays.equals(char_set, char_set1)){
            isAnagram = true;
        }


        return isAnagram;

    }*/



  /*  public static boolean isAnagram (String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static boolean iAnagram (String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean checkAnagram (String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }
*/

