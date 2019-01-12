package com.modeling.animal;

import com.modeling.feature.attribute.LanguageAttribute;

public class Rooster extends Chicken {
    public Rooster(){
        LanguageAttribute.set(this, "Cock-a-doodle-doo");
    }
}
