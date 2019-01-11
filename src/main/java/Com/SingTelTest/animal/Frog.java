package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.JumpAction;
import Com.SingTelTest.feature.action.SwimAction;

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
