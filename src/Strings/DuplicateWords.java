package Strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWords {

    public static void main (String[] args) {
        String test = "Java and JavaScript are totally different, JavaScript follows Java";
        Set<String> duplicates = duplicateWords(test);
        System.out.println("input : " + test);
        System.out.println("output : " + duplicates);
    }
    public static Set<String> duplicateWords (String input) {
        if (input == null || input.isEmpty()) {
            return Collections.emptySet();
        }
        Set<String> duplicates = new HashSet<String>();
        String[] words = input.split("\\s+");
        Set<String> set = new HashSet<String>();
        for (String word : words) {
            if (!set.add(word)) {
                duplicates.add(word);
            }
        }
        return duplicates;
    }

}
