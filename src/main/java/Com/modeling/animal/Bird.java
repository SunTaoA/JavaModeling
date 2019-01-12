package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.WalkAction;
import com.modeling.feature.attribute.LanguageAttribute;

public class Bird extends Animal {
    public Bird(){
        add(new WalkAction());
        add(new SingAction());
        add(new LanguageAttribute("I'm singing"));
        add(new FlyAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }

    public boolean fly(){
        return performAction(FlyAction.KEY);
    }

    public boolean sing(){
        return performAction(SingAction.KEY);
    }
}
