package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testCalculate () {
        SQRService service = new SQRService();
        int start = 10;
        int end = 99;
        int expected = 6;

        int actual = service.calculate(start, end);

        Assertions.assertEquals(expected, actual);
    }
}
