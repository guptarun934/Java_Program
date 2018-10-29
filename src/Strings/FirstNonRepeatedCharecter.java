package Strings;

import java.util.*;

public class FirstNonRepeatedCharecter {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "swiss";
        char c = firstNonRepeatedCharacter(str);
        System.out.println(c);

    }

       /* public static char getFirstNonRepeatedChar(String str) {
            Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>(str.length());

            for (char c : str.toCharArray()) {
                counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
            }

            for (Entry<Character,Integer> entry : counts.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }
            throw new RuntimeException("didn't find any non repeated Character");
        }

        public static char firstNonRepeatingChar(String word) {
            Set<Character> repeating = new HashSet<>();
            List<Character> nonRepeating = new ArrayList<>();
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (repeating.contains(letter)) {
                    continue;
                }
                if (nonRepeating.contains(letter)) {
                    nonRepeating.remove((Character) letter);
                    repeating.add(letter);
                } else {
                    nonRepeating.add(letter);
                }
            }
            return nonRepeating.get(0);
        }*/

    public static char firstNonRepeatedCharacter (String word) {
        HashMap<Character, Integer> scoreboard = new HashMap<Character, Integer>();
        // build table [char -> count]
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        // since HashMap doesn't maintain order, going through string again
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }

}

