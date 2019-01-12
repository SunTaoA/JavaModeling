package com.modeling.rest;

import com.modeling.animal.*;
import com.modeling.feature.action.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ApiController {

    Animal[] animals = new Animal[]{
            new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            new Parrot("Woof, woof", "living with dogs"),
            new Fish(),
            new Shark(),
            new ClownFish(),
            new Dolphin(),
            new Frog(),
            new Dog(),
            new ButterFly(),
            new Cat()
    };

    @RequestMapping("/api/animals/count")
    public long getResource(@RequestParam(value = "type", defaultValue = "") String type) {
        long count = 0;
        if ("fly".equals(type)) {
            count = Arrays.asList(animals).stream().filter(x -> x.hasFeature(FlyAction.KEY)).count();
        } else if ("walk".equals(type)) {
            count = Arrays.asList(animals).stream().filter(x -> x.hasFeature(WalkAction.KEY)).count();
        } else if ("swim".equals(type)) {
            count = Arrays.asList(animals).stream().filter(x -> x.hasFeature(SwimAction.KEY)).count();
        } else if ("sing".equals(type)) {
            count = Arrays.asList(animals).stream().filter(x -> x.hasFeature(SingAction.KEY)).count();
        } else {
            count = animals.length;
        }
        return count;
    }
}