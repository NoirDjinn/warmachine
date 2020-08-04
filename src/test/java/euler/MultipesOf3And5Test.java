package euler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipesOf3And5Test {

    @Test
    public void testSomething() {
        assertEquals(23, MultipesOf3And5.findSumOfMultiples(10));
        assertEquals(233168, MultipesOf3And5.findSumOfMultiples(1000));
    }
}
