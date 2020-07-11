package kyu6;
// Instructions at https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

public class DuplicateEncoder {
    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            final Character currentChar = Character.toLowerCase(word.charAt(i));
            long countCurrentChar = word.chars().filter(ch -> ch == currentChar).count();

            if (countCurrentChar == 1) {
                result.append("(");
            } else {
                result.append(")");
            }
        }

        return result.toString();
    }
}
