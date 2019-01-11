package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.SwimAction;
import Com.SingTelTest.feature.attribute.LanguageAttribute;

public class Duck extends  Bird{
    public Duck() {
        add(new SwimAction());

        LanguageAttribute.set(this, "Quack, quack");
    }

    public boolean swim(){
        return performAction(SwimAction.KEY);
    }
}
