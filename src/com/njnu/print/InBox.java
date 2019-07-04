package com.njnu.print;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InBox implements IBox{
    private Float weight;
    @Value(value = "黑色")
    private String color;
    private Integer intColor;

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIntColor() {
        return intColor;
    }

    public void setIntColor(Integer intColor) {
        this.intColor = intColor;
    }
//    public InBox(){
//        //白
//        intColor=0xffffff;
//    }
}
