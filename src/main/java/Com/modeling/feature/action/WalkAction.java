package com.modeling.feature.action;

import com.modeling.animal.Animal;

public class WalkAction implements Action {
    public static final String KEY = "walk";

    public boolean run(Animal host) {
        System.out.println("I am walking");
        return true;
    }

    public String getName() {
        return KEY;
    }
}
