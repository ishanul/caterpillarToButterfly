package transition;

import insect.Animal;
import insect.Butterfly;
import insect.Caterpillar;

public class CaterpillarState extends Metamorphosis {

    public Animal changeToNext(Animal animal){
        System.out.println("Caterpillar Changing to Butterfly");
        animal.setState(new ButterflyState());
        return new Butterfly((Caterpillar) animal);

    }
}
