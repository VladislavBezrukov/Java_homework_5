package ru.netology.sqr;

public class SQRService {

    public int calculate(int start, int end) {
        int count = 0;
        for (double i = 10; i <= 99; i++) {
            if (i * i >= start) {
                if(i * i <= end) {
                count++;
                }
            }
        }
        return count;
    }
}

