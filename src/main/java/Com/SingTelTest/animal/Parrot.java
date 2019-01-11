package Com.SingTelTest.animal;

import Com.SingTelTest.feature.attribute.LanguageAttribute;
import Com.SingTelTest.feature.attribute.PositionAttribute;

public class Parrot extends Bird {
    public Parrot(String language, String position){
        add(new PositionAttribute(position));
        setAttribute(LanguageAttribute.KEY, language);
    }

    public  void setLanguage(String language){
        setAttribute(LanguageAttribute.KEY, language);
    }

    public String getLanguage(){

        return (String)getAttribute(LanguageAttribute.KEY);
    }

    public void setPosition(String position){
        setAttribute(PositionAttribute.KEY, position);

    }
    public String getPosition(){
        return (String)getAttribute(PositionAttribute.KEY);
    }
}
