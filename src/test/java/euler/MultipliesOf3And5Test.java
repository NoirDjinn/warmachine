package euler;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipliesOf3And5Test {

    @Test
    public void testSomething() {
        assertEquals(23, MultipliesOf3And5.findSumOfMultiples(10));
        assertEquals(233168, MultipliesOf3And5.findSumOfMultiples(1000));
    }
}
