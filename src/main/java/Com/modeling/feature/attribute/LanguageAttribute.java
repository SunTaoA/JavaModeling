package com.modeling.feature.attribute;

import com.modeling.animal.Animal;

public class LanguageAttribute extends Attribute{
    public static final String KEY = "language";

    public LanguageAttribute(String value){
        super(KEY, value);
    }

    public static void set(Animal host, String value){
        LanguageAttribute language = (LanguageAttribute) host.getFeature(KEY);
        if(language!=null){
            language.setValue(value);
        }
    }
}
