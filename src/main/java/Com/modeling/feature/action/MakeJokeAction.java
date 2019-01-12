package com.modeling.feature.action;

import com.modeling.animal.Animal;

public class MakeJokeAction implements Action{
    public static final String KEY = "MakeJoke";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {
        System.out.println("I am making jokes");
        return true;
    }
}