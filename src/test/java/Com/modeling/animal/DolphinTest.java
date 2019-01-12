package com.modeling.animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DolphinTest {
    @Test
    void shouldSwim(){
        Dolphin dolphin = new Dolphin();
        boolean result = dolphin.swim();
        Assert.assertTrue(result);
    }
}