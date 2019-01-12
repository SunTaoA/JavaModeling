package com.modeling;

import com.modeling.animal.*;
import com.modeling.feature.action.FlyAction;
import com.modeling.feature.action.SingAction;
import com.modeling.feature.action.SwimAction;
import com.modeling.feature.action.WalkAction;
import com.modeling.feature.attribute.LanguageAttribute;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.sing();
        duck.swim();

        Chicken chicken = new Chicken();
        chicken.sing();
        chicken.fly();

        Rooster rooster = new Rooster();
        rooster.sing();

        LanguageAttribute.set(rooster, "咯咯咯");
        rooster.sing();

        Parrot parrot1 = new Parrot("Woof, woof", "living with dogs");
        Parrot parrot2 = new Parrot("Meow", "living with cats");
        Parrot parrot3 = new Parrot("Cock-a-doodle-doo", "living near the rooster");
        parrot1.sing();
        parrot2.sing();
        parrot3.sing();

        countAnimals();
    }

    private static void countAnimals() {
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

       long flyCount = Arrays.asList(animals).stream().filter(x -> x.hasFeature(FlyAction.KEY)).count();
       long walkCount = Arrays.asList(animals).stream().filter(x -> x.hasFeature(WalkAction.KEY)).count();
       long singCount = Arrays.asList(animals).stream().filter(x -> x.hasFeature(SingAction.KEY)).count();
       long swimCount = Arrays.asList(animals).stream().filter(x -> x.hasFeature(SwimAction.KEY)).count();

        System.out.println("fly count: " + flyCount);
        System.out.println("walk count: " + walkCount);
        System.out.println("sing count: " + singCount);
        System.out.println("swim count: " + swimCount);
    }
}