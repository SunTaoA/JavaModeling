package com.modeling.animal;

import com.modeling.feature.attribute.ColorAttribute;
import com.modeling.feature.attribute.SizeAttribute;

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
