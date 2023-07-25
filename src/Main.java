import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Speakable> animals = new ArrayList<>();
        animals.add(new Cat("Васька"));
        animals.add(new Dog("Жучка"));
        animals.add(new Radio());

        NoseZoo noseZoo = new NoseZoo(animals);
        noseZoo.speakAll();
    }
}
