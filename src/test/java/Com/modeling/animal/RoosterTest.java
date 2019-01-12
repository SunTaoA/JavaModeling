package com.modeling.animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RoosterTest {
    @Test
    void shouldSing() {
        Rooster rooster = new Rooster();
        boolean result = rooster.sing();
        Assert.assertTrue(result);
    }
}