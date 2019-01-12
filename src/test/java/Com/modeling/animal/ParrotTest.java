package com.modeling.animal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ParrotTest {
    @Test
    void shouldSing(){
        Parrot parrot = new Parrot("Woof, woof", "living with dogs");
        boolean result = parrot.sing();
        Assert.assertTrue(result);

        String lang = parrot.getLanguage();
        Assert.assertSame(lang, "Woof, woof");
    }
}