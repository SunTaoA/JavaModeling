package com.modeling.animal;

import com.modeling.feature.action.MakeJokeAction;
import com.modeling.feature.attribute.ColorAttribute;
import com.modeling.feature.attribute.SizeAttribute;

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
