package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.MakeJokeAction;
import Com.SingTelTest.feature.attribute.ColorAttribute;
import Com.SingTelTest.feature.attribute.SizeAttribute;

public class ClownFish  extends ColorfulFish {
    public ClownFish(){
        add(new MakeJokeAction());

        setAttribute(ColorAttribute.KEY, "orange");
        setAttribute(SizeAttribute.KEY, "small");
    }

    public boolean makeJokes(){
        return performAction(MakeJokeAction.KEY);
    }

}
