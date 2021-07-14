package transition;

import insect.Animal;

public class CaterpillarState extends Metamorphosis {

    public void changeToNext(Animal animal){
        System.out.println("Caterpillar Changing to Butterfly");
        animal.setState(new ButterflyState());

    }
}
