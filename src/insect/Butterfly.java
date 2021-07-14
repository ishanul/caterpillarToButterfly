package insect;


import transition.ButterflyState;

public class Butterfly extends Animal {

    public Butterfly(Caterpillar caterpillar) {
        setState(new ButterflyState());
    }

    @Override
    public String toString() {
        return "Butterfly{}";
    }
}
