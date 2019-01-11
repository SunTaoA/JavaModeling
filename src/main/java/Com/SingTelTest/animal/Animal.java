package Com.SingTelTest.animal;

import Com.SingTelTest.feature.Feature;
import Com.SingTelTest.feature.action.Action;
import Com.SingTelTest.feature.attribute.Attribute;

import java.util.HashMap;
import java.util.Map;

public abstract  class Animal {
     private Map<String, Feature> features;

     public Animal() {
         features = new HashMap<String, Feature>();
     }

    public boolean hasFeature(String name){
        return features.containsKey(name);
    }

    public Feature getFeature(String name){
        return features.get(name);
    }

    protected boolean performAction(String name){
        Action action = (Action)getFeature(name);
        if(action == null){
            //throw new IllegalStateException();
            return false;
        }
        return action.run(this);
    }

    protected void add(Feature feature){
        features.put(feature.getName(), feature);
    }

    protected void remove(Feature feature){
        features.remove(feature.getName());
    }

    protected void remove(String name){
        features.remove(name);
    }

    protected Object getAttribute(String name){
        Attribute attribute = (Attribute) getFeature(name);
        if(attribute!=null){
            return attribute.getValue();
        }
        return null;
    }

    protected void setAttribute(String name, Object value){
        Attribute attribute = (Attribute) getFeature(name);
        if(attribute!=null){
            attribute.setValue(value);
        }
    }
}
