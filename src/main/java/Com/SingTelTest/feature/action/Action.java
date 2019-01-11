package Com.SingTelTest.feature.action;

import Com.SingTelTest.animal.Animal;
import Com.SingTelTest.feature.Feature;

public interface Action extends Feature {
    boolean run(Animal host);
}
