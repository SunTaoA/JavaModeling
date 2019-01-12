package com.modeling.feature.attribute;

import com.modeling.feature.Feature;

public class Attribute implements Feature {
    private String name;
    private Object value;
    public Attribute(String name, Object value){
        this.value = value;
        this.name = name;
    }

    public String getName() { return this.name;}
    public Object getValue() { return this.value;}
    public void  setValue(Object value) {this.value = value;}
}
