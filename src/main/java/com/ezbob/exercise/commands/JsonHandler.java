package com.ezbob.exercise.commands;

import com.ezbob.exercise.formats.JsonFormat;
import com.ezbob.exercise.formats.JsonNumbersOperator;
import com.ezbob.exercise.numbers.PositiveNumbers;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class JsonHandler {
    private Logger LOG= LoggerFactory.getLogger(JsonHandler.class);
    private JsonFormat jsonFormat= new JsonNumbersOperator();




    @ShellMethod("Selecting data format : Json  {numbers,operator} is default")
    public String format( @ShellOption(defaultValue = "json numbers") String name){

        switch (name) {
            case "json numbers":
                jsonFormat =new JsonNumbersOperator();
                return "\njson selected ";


        }

        return "\nno match";
    }

    @ShellMethod("Selecting number strategy : Positive is default")
    public String strategy(@ShellOption(defaultValue = "positive") String name){
        switch (name){
            case "positive":
                jsonFormat.setStrategy(new PositiveNumbers());
                return "\nPositive number strategy selected";

        }
        return "\nno match";
    }

    @ShellMethod("Gets a Json Object -Checking compatibility of numbers and strategy and calculating. ")
    public String calculate(String Json){
        if(jsonFormat.getStrategy()==null){
            jsonFormat.setStrategy(new PositiveNumbers());
        }

        JsonObject jsonObject= new Gson().fromJson(Json,JsonObject.class);

        jsonFormat.setJson(jsonObject);
        if(jsonFormat.isCompatibleToStrategy()) {
            LOG.info("The result is: " + jsonFormat.calc());
            return "\nThe result is: " + jsonFormat.calc();
        }
        return "\nNumbers not compatible to strategy";


    }
}
