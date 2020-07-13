package kyu6;
// Instructions at https://www.codewars.com/kata/5949481f86420f59480000e7/train/java

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
       if (array.length == 0) {
           return "even";
       }

       long sum = Arrays.stream(array).sum();
       if (sum % 2 == 0) {
           return "even";
       }
       else {
           return "odd";
       }
    }
}
