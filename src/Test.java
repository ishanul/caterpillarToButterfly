import insect.Animal;
import insect.Caterpillar;
import transition.CaterpillarState;

public class Test {
    public static void main(String[] args) {
        Animal caterpillar = new Caterpillar();
        System.out.println("I am " + caterpillar + " and in state of " + caterpillar.getState());

        Animal butterfly = caterpillar.transit();

        System.out.println("I am " + butterfly + " and in state of " + butterfly.getState());
    }
}
