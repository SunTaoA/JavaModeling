package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.WalkAction;

public class ButterFly extends Animal {
    private boolean advanced = false;

    public ButterFly(){
        add(new WalkAction());
    }

    public boolean getAdvanced(){
        return advanced;
    }

    /**
     * metamorphosis from caterpillar to butterfly
     */
    public void develop(){
        advanced = true;
        remove(WalkAction.KEY);
        add(new FlyAction());
    }

    public boolean fly(){
        return performAction(FlyAction.KEY);
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }
}
