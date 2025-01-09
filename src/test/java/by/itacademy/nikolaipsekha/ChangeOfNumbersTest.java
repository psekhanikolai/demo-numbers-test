package by.itacademy.nikolaipsekha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChangeOfNumbersTest {
    @Test
    public void testChangeOfNumber(){
        Assertions.assertEquals("a=2, b=3,c= 4 excellent",ChahgeOfNumbers.numbersOfChange(2,3,4) );
    }
}
