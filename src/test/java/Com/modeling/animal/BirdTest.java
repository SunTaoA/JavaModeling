package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.WalkAction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BirdTest {
    @Test
    void shouldSing(){
        Bird bird = new Bird();
        boolean result = bird.sing();
        Assert.assertTrue(result);
    }


    @Test
    void shouldFly(){
        Bird bird = new Bird();
        boolean result = bird.fly();

        Assert.assertTrue(result);
    }

    @Test
    void canSing(){
        Bird bird = new Bird();
        boolean result = bird.hasFeature(SingAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canFly(){
        Bird bird = new Bird();
        boolean result = bird.hasFeature(FlyAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canWalk(){
        Bird bird = new Bird();
        boolean result = bird.hasFeature(WalkAction.KEY);
        Assert.assertTrue(result);
    }
}