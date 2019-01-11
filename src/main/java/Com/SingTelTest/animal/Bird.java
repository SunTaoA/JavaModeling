package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.FlyAction;
import Com.SingTelTest.feature.action.SingAction;
import Com.SingTelTest.feature.action.WalkAction;
import Com.SingTelTest.feature.attribute.LanguageAttribute;

public class Bird extends Animal {
    public Bird(){
        add(new WalkAction());
        add(new SingAction());
        add(new LanguageAttribute("I'm singing"));
        add(new FlyAction());
    }

    public boolean walk(){
        return performAction(WalkAction.KEY);
    }

    public boolean fly(){
        return performAction(FlyAction.KEY);
    }

    public boolean sing(){
        return performAction(SingAction.KEY);
    }
}
