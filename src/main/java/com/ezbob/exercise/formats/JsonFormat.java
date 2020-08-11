package com.ezbob.exercise.formats;


import com.google.gson.JsonObject;
import lombok.Data;

@Data
public abstract class JsonFormat extends DataFormat {
  public abstract  void setJson(JsonObject jsonObject);
   public abstract  int calc();
   public abstract boolean isCompatibleToStrategy();


   }
