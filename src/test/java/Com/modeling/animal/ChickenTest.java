package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.WalkAction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ChickenTest {
    @Test
    void shouldSing(){
        Chicken chicken = new Chicken();
        boolean result = chicken.sing();
        Assert.assertTrue(result);
    }

    @Test
    void shouldNotFly(){
        Chicken chicken = new Chicken();
        boolean result = chicken.fly();
        Assert.assertFalse(result);
    }

    @Test
    void canWalk(){
        Chicken chicken = new Chicken();
        boolean result = chicken.hasFeature(WalkAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void canSing(){
        Chicken chicken = new Chicken();
        boolean result = chicken.hasFeature(SingAction.KEY);
        Assert.assertTrue(result);
    }

    @Test
    void cannotFly(){
        Chicken chicken = new Chicken();
        boolean result = chicken.hasFeature(FlyAction.KEY);
        Assert.assertFalse(result);
    }

    @Test
    void asRooster(){
        Chicken chicken = new Chicken(true);
        boolean result = chicken.isRooster();
        Assert.assertTrue(result);
    }
}