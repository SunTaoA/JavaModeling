package com.modeling.animal;

import com.modeling.feature.attribute.ColorAttribute;
import com.modeling.feature.attribute.SizeAttribute;

public class Shark extends ColorfulFish{

    public Shark(){
        setAttribute(ColorAttribute.KEY, "grey");
        setAttribute(SizeAttribute.KEY, "big");
    }

    public boolean eat(Fish fish){
        if(fish == this){
            return false;
        }
        return true;
    }
}
