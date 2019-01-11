package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;

public class FlyAction implements Action {
    public static final String KEY = "fly";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {
        System.out.println("I am flying");
        return true;
    }
}
