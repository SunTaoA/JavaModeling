package com.modeling.feature.action;

import com.modeling.animal.Animal;
import com.modeling.feature.Feature;

public interface Action extends Feature {
    boolean run(Animal host);
}
