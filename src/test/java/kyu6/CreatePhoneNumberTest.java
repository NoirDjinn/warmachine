package kyu6;

import org.junit.Test;
import static org.junit.Assert.*;

public class CreatePhoneNumberTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
