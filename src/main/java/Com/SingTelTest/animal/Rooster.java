package Com.SingTelTest.animal;

import Com.SingTelTest.feature.attribute.LanguageAttribute;

public class Rooster extends Chicken {
    public Rooster(){
        LanguageAttribute.set(this, "Cock-a-doodle-doo");
    }
}
