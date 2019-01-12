package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.SwimAction;
import com.modeling.feature.action.WalkAction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DuckTest {
    @Test
    void shouldSing(){
        Duck duck = new Duck();
        boolean result = duck.sing();
        Assert.assertTrue(result);
    }

    @Test
    void shouldFly(){
        Duck duck = new Duck();
        boolean result = duck.fly();
        Assert.assertTrue(result);
    }

    @Test
    void shouldSwim(){
        Duck duck = new Duck();
        boolean result = duck.swim();
        Assert.assertTrue(result);
    }

    @Test
    void canWalk(){
        Duck duck = new Duck();
        boolean result = duck.hasFeature(WalkAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canSing(){
        Duck duck = new Duck();
        boolean result = duck.hasFeature(SingAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canFly(){
        Duck duck = new Duck();
        boolean result = duck.hasFeature(FlyAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canSwim(){
        Duck duck = new Duck();
        boolean result = duck.hasFeature(SwimAction.KEY);
        Assert.assertTrue(result);
    }
}