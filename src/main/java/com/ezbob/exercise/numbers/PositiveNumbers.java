package com.ezbob.exercise.numbers;

import java.util.List;

public class PositiveNumbers implements NumberStrategy {

    @Override
    public boolean check(List<Integer> numbers) {
        boolean isPositive = true;
        for (int n : numbers) {
            if (n < 0) {
                isPositive = false;
            }
        }
        return isPositive;
    }
}
