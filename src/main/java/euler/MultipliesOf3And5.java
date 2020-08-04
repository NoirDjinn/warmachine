package euler;
// Instructions at https://projecteuler.net/problem=1

public class MultipliesOf3And5 {
    public static long findSumOfMultiples(int maxNumber) {
        long sum = 0;
        for (int i = 0; i < maxNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
