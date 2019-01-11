package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.WalkAction;

public class Cat extends Animal {
    public Cat(){
        add(new WalkAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }
}
