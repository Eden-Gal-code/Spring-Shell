package com.ezbob.exercise.operators;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlusOperator implements Operator {
    @Override
    public int doOperation(List<Integer> numbers) {
        int sum=0;
        for (int n:
             numbers) {
            sum+=n;

        }
        return sum;
    }


}
