package kyu6;
// Instructions at https://www.codewars.com/kata/5839edaa6754d6fec10000a2/train/java

public class FindTheMissingLetter {
    public static char findMissingLetter(char[] array)
    {
        for (int i = 1; i < array.length; i++) {
            if ((int) array[i] - (int) array[i - 1] != 1) {
                return (char) ((int) array[i] - 1);
            }
        }
        return '.';
    }
}
