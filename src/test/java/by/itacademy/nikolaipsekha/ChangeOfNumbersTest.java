package by.itacademy.nikolaipsekha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeOfNumbersTest {
    @Test
    public void testChangeOfNumber1() {
        Assertions.assertEquals("a=2, b=3, c=4 excellent", ChahgeOfNumbers.numbersOfChange(2, 3, 4));
    }

    @Test
    public void testChangeOfNumber2() {
        Assertions.assertEquals("a=2, b=3, c=-4 good", ChahgeOfNumbers.numbersOfChange(2, 3, -4));

    }

    @Test
    public void testChangeOfNumber3() {
        Assertions.assertEquals("a=2, b=-3, c=-4 fine", ChahgeOfNumbers.numbersOfChange(2, -3, -4));

    }

    @Test
    public void testChangeOfNumber4() {
        Assertions.assertEquals("a=-2, b=-3, c=-4 bad", ChahgeOfNumbers.numbersOfChange(-2, -3, -4));

    }
}