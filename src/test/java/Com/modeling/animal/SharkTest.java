package com.modeling.animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SharkTest {
    @Test
    void shouldBeLarge(){
        Shark shark = new Shark();
        String size = shark.getSize();
        Assert.assertSame(size, "big");
    }

    @Test
    void shouldBeGrey(){
        Shark shark = new Shark();
        String color = shark.getColor();
        Assert.assertSame(color, "grey");
    }

    @Test
    void shouldEatColownFish(){
        Shark shark = new Shark();
        ClownFish fish = new ClownFish();
        boolean result = shark.eat(fish);
        Assert.assertTrue(result);
    }
}