package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.SwimAction;

public class Fish extends Animal {
    public Fish(){
        add(new SwimAction());
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
