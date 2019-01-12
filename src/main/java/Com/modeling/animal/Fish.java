package com.modeling.animal;

import com.modeling.feature.action.SwimAction;

public class Fish extends Animal {
    public Fish(){
        add(new SwimAction());
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
