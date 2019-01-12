package com.modeling.animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ClownFishTest {
    @Test
    void shouldBeSmall(){
        ClownFish fish = new ClownFish();
        String size = fish.getSize();
        Assert.assertSame(size, "small");
    }

    @Test
    void shouldBeOrange(){
        ClownFish fish = new ClownFish();
        String color = fish.getColor();
        Assert.assertSame(color, "orange");
    }

    @Test
    void shouldMakeJokes(){
        ClownFish fish = new ClownFish();
        boolean result = fish.makeJokes();
        Assert.assertTrue(result);
    }
}