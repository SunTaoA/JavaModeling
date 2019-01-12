package com.modeling.animal;

import com.modeling.feature.action.SwimAction;

public class Dolphin extends Animal {
    public Dolphin(){
        add(new SwimAction());
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
