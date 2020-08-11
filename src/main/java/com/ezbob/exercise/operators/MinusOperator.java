package com.ezbob.exercise.operators;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class MinusOperator implements Operator {
    @Override
    public int doOperation(List<Integer> numbers) {
        int sub=0;
        if(numbers.isEmpty()==false) {
             sub = numbers.get(0);
        }
        for (int i = 1; i <numbers.size() ; i++) {
            sub-=numbers.get(i);
        }
        return sub;
    }
}
