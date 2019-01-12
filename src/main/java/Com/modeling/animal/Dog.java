package com.modeling.animal;

import com.modeling.feature.action.WalkAction;

public class Dog  extends  Animal {
    public Dog(){
        add(new WalkAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }
}
