package com.modeling.feature.action;

import com.modeling.animal.Animal;

public class SwimAction implements  Action {
    public static final String KEY = "swim";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {
        System.out.println("I am swimming");
        return true;
    }
}
