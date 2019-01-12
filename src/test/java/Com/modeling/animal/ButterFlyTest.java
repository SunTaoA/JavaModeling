package com.modeling.animal;

import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.WalkAction;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ButterFlyTest {

    @Test
    void canWalkIfCaterpillar(){
        ButterFly butterfly = new ButterFly();
        boolean result = butterfly.walk();
        Assert.assertTrue(result);
        Assert.assertFalse(butterfly.getAdvanced());
        Assert.assertFalse(butterfly.hasFeature(FlyAction.KEY));
    }

    @Test
    void canFlyAfterMetamorphosis(){
        ButterFly butterfly = new ButterFly();
        butterfly.develop();
        boolean result = butterfly.fly();
        Assert.assertTrue(result);
        Assert.assertTrue(butterfly.getAdvanced());
        Assert.assertFalse(butterfly.hasFeature(WalkAction.KEY));
    }

    @Test
    void cannotSing(){
        ButterFly butterfly = new ButterFly();
        boolean result = butterfly.hasFeature(SingAction.KEY);
        Assert.assertFalse(result);
    }
}