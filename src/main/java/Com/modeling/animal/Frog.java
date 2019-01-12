package com.modeling.animal;

import com.modeling.feature.action.JumpAction;
import com.modeling.feature.action.SwimAction;

public class Frog extends Animal{

    public Frog(){
        add(new SwimAction());
        add(new JumpAction());
    }

    public boolean jump(){
        return performAction(JumpAction.KEY);
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
