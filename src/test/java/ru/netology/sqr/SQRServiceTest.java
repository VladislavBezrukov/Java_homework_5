package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void testCalculate () {
        SQRService service = new SQRService();
        int start = 200;
        int end = 300;
        int expected = 3;

        int actual = service.calculate(start, end);

        Assertions.assertEquals(expected, actual);
    }
}
