package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheParityOutlier {
    static int find(int[] integers) {
        List<Integer> evens = Arrays.stream(integers).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
        List<Integer> odds = Arrays.stream(integers).filter(i -> i % 2 != 0).boxed().collect(Collectors.toList());

        return evens.size() == 1 ? evens.get(0) : odds.get(0);
    }
}
