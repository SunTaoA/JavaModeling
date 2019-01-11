package Com.SingTelTest.animal;

import Com.SingTelTest.feature.action.SwimAction;
import Com.SingTelTest.feature.attribute.ColorAttribute;
import Com.SingTelTest.feature.attribute.SizeAttribute;

public class ColorfulFish extends  Fish {
    public ColorfulFish(){
        add(new ColorAttribute(null));
        add(new SizeAttribute(null));
    }

    public String getColor(){
        return (String)getAttribute(ColorAttribute.KEY);
    }

    public String getSize(){
        return (String)getAttribute(SizeAttribute.KEY);
    }

}
