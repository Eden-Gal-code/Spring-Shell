package com.ezbob.exercise.formats;

import com.ezbob.exercise.numbers.NumberStrategy;
import com.ezbob.exercise.operators.Operator;
import com.ezbob.exercise.operators.OperatorFactory;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonNumbersOperator extends JsonFormat {
    private List<Integer> numbers = new ArrayList<>();
    private Operator operator;
    private NumberStrategy strategy;

    public void setJson(JsonObject jsonObject) {
        List<Integer> numFromJson = new ArrayList<>();
        for (int i = 0; i < jsonObject.getAsJsonArray("numbers").size(); i++) {
            numFromJson.add(jsonObject.getAsJsonArray("numbers").get(i).getAsInt());

        }


            numbers = numFromJson;


        operator = OperatorFactory.getFactory(jsonObject.get("operator").getAsString());
    }
    public boolean isCompatibleToStrategy(){
        return strategy.check(numbers);
    }
    public int calc(){

       return operator.doOperation(numbers);
    }


}
