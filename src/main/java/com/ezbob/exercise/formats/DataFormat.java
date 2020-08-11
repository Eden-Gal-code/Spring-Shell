package com.ezbob.exercise.formats;

import com.ezbob.exercise.numbers.NumberStrategy;
import lombok.Data;

@Data
public abstract class DataFormat {
    private NumberStrategy strategy;
}
