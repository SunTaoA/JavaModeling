package com.modeling.animal;

import com.modeling.feature.action.WalkAction;

public class Cat extends Animal {
    public Cat(){
        add(new WalkAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }
}
