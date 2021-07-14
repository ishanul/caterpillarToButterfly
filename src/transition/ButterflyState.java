package transition;

import insect.Animal;

public class ButterflyState extends Metamorphosis {


    public Animal changeToNext(Animal animal){
        System.out.println("No Change");
        return animal;
    }
}
