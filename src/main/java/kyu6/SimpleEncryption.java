package kyu6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SimpleEncryption {
    public static String encrypt(final String text, final int n) {
        String encryptedText = text;

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

        for (int i = 0; i < n; i++) {

        }

        return text;
    }
}
