package insect;

import transition.CaterpillarState;
import transition.Metamorphosis;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.setState(new CaterpillarState());
    }

    @Override
    public String toString() {
        return "Caterpillar{}";
    }
}
