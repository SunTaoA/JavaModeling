package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;

public class JumpAction implements Action {
    public static final String KEY = "jump";

    public String getName() {
        return KEY;
    }

    public boolean run(Animal host) {

        System.out.println("I am jumping");
        return true;
    }
}
