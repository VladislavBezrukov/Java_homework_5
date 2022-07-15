package ru.netology.sqr;

public class SQRService {

    public int calculate(int start, int end) {
        int count = 0;
        for (double i = start; i <= end; i++) {
            double result = Math.sqrt(i);
            if (result % 1 == 0) {
                count++;
            }
        }
        return count;
    }
}

