import insect.Animal;
import insect.Caterpillar;
import transition.CaterpillarState;

public class Test {
    public static void main(String[] args) {
        Animal caterpillar = new Caterpillar();
        System.out.println(caterpillar.getState());

        caterpillar.transit();

        System.out.println(caterpillar.getState());
    }
}
