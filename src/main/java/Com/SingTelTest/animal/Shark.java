package Com.SingTelTest.animal;

import Com.SingTelTest.feature.attribute.ColorAttribute;
import Com.SingTelTest.feature.attribute.SizeAttribute;

public class Shark extends ColorfulFish{

    public Shark(){
        setAttribute(ColorAttribute.KEY, "grey");
        setAttribute(SizeAttribute.KEY, "big");
    }

    public boolean eat(Fish fish){
        if(fish == this){
            return false;
        }
        return true;
    }
}
