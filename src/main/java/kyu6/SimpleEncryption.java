package kyu6;
// Instructions at https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleEncryption {
    public static String encrypt(final String text, final int n) {
        String encryptedText = text;

        if (text == null || text.equals("") || n <= 0) {
            return text;
        }

        for (int i = 0; i < n; i++) {
            List<Character> charAtEven =
                    IntStream.range(0, text.length())
                            .filter(c -> c % 2 == 0)
                            .mapToObj(encryptedText::charAt)
                            .collect(Collectors.toList());

            List<Character> charAtOdd =
                    IntStream.range(0, text.length())
                            .filter(c -> c % 2 != 0)
                            .mapToObj(encryptedText::charAt)
                            .collect(Collectors.toList());

            String stringEven = charAtEven.stream().map(String::valueOf).collect(Collectors.joining());
            String stringOdd = charAtOdd.stream().map(String::valueOf).collect(Collectors.joining());

            encryptedText = stringOdd + stringEven;
        }
        return encryptedText;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String text = encryptedText;

        if (text == null || text.equals("") || n <= 0) {
            return text;
        }

        int divider = text.length() / 2;


        for (int i = 0; i < n; i++) {
            List<Character> charAtEven =
                    IntStream.range(0, divider)
                            .mapToObj(text::charAt)
                            .collect(Collectors.toList());

            List<Character> charAtOdd =
                    IntStream.range(divider, text.length())
                            .mapToObj(text::charAt)
                            .collect(Collectors.toList());

            StringBuilder textBuilder = new StringBuilder();

            for (int j = 0; j < charAtEven.size(); j++) {
                textBuilder.append(charAtOdd.get(j));
                textBuilder.append(charAtEven.get(j));
            }

            if (charAtOdd.size() > charAtEven.size()) {
                textBuilder.append(charAtOdd.get(charAtOdd.size() - 1));
            }
            text = textBuilder.toString();
        }

        return text;
    }
}
