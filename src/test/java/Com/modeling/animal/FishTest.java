package com.modeling.animal;

import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.SwimAction;
import com.modeling.feature.action.WalkAction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FishTest {
    @Test
    void shouldSwim(){
        Fish fish = new Fish();
        boolean result = fish.swim();
        Assert.assertTrue(result);
    }

    @Test
    void canSwim(){
        Fish fish = new Fish();
        boolean result = fish.hasFeature(SwimAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void cannotWalk(){
        Fish fish = new Fish();
        boolean result = fish.hasFeature(WalkAction.KEY);
        Assert.assertFalse(result);
    }

    @Test
    void cannotSing(){
        Fish fish = new Fish();
        boolean result = fish.hasFeature(SingAction.KEY);
        Assert.assertFalse(result);
    }
}