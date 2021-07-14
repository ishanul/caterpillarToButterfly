package insect;

import transition.Metamorphosis;

public abstract class Animal {
    private Metamorphosis state;

    public Metamorphosis getState() {
        return state;
    }

    public void setState(Metamorphosis state) {
        this.state = state;
    }

    public void transit(){
        state.changeToNext(this);
    }
}
