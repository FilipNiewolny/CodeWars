package CodeWars.SumOfNumbers;

import org.junit.Test;

import static org.junit.Assert.*;
import CodeWars.SumOfNumbers.Sum.*;

public class SumOfNumbersTest {


    @Test
    public void getSum() {
        Sum s = new Sum();
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(2, s.GetSum(-1, 2));

    }
}