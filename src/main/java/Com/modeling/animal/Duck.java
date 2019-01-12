package com.modeling.animal;

import com.modeling.feature.action.SwimAction;
import com.modeling.feature.attribute.LanguageAttribute;

public class Duck extends  Bird{
    public Duck() {
        add(new SwimAction());

        LanguageAttribute.set(this, "Quack, quack");
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
