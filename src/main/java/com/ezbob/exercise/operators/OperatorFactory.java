package com.ezbob.exercise.operators;

public class OperatorFactory {
    public static Operator getFactory(String name){
        switch (name){
            case "plus":
                return new PlusOperator();
            case"minus":
                return new MinusOperator();
        }
        return null;
    }
}
