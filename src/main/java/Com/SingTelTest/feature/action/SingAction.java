package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;
import Com.SingTelTest.feature.attribute.LanguageAttribute;

public class SingAction implements  Action{
    public final static String KEY = "sing";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {
        LanguageAttribute lang = (LanguageAttribute) host.getFeature(LanguageAttribute.KEY);
        if(lang == null){
            //throw new IllegalStateException();
            return false;
        }

        System.out.println(lang.getValue());

        return true;
    }
}
