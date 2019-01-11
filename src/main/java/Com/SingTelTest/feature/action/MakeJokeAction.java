package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;

public class MakeJokeAction implements Action{
    public static final String KEY = "MakeJoke";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {
        System.out.println("I am making jokes");
        return true;
    }
}