package kyu6;

public class FindTheParityOutlier {
    static int find(int[] integers) {
        int firstThreeRemainders = integers[0] % 2 + integers[1] % 2 + integers[2] % 2;
        int outlierRemainder = firstThreeRemainders < 2 ? 1 : 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == outlierRemainder) {
                return integers[i];
            }
        }
        return -1;
    }
}
