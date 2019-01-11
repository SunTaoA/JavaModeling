package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.WalkAction;

public class Dog  extends  Animal {
    public Dog(){
        add(new WalkAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }
}
