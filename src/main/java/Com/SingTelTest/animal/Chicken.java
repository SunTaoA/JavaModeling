package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.FlyAction;
import Com.SingTelTest.feature.attribute.LanguageAttribute;

public class Chicken extends Bird{
    private boolean roaster;

    public  Chicken() {
        this(false);
    }

    public Chicken(boolean roaster){
        this.remove(FlyAction.KEY);

        this.roaster = roaster;

        LanguageAttribute.set(this, roaster ? "Cock-a-doodle-doo" : "Cluck, cluck");
    }
}
