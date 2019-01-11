package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;

public class WalkAction implements Action {
    public static final String KEY = "walk";

    public boolean run(Animal host) {
        System.out.println("I am walking");
        return true;
    }

    public String getName() {
        return KEY;
    }
}
