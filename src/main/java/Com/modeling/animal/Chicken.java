package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.attribute.LanguageAttribute;

public class Chicken extends Bird{
    private boolean roaster;

    public  Chicken() {
        this(false);
    }

    public Chicken(boolean roaster){
        this.remove(FlyAction.KEY);

        this.roaster = roaster;

        LanguageAttribute.set(this, roaster ? "Cock-a-doodle-doo" : "Cluck, cluck");
    }

    public boolean isRooster(){
        return this.roaster;
    }
}
