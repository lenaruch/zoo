import java.util.List;

public class NoseZoo {
    private List<Speakable> animals;

    public NoseZoo(List<Animal> animals) {
        this.animals = animals;
    }

    public void speakAll(){
        for (Speakable animal: animals){
            animal.speak();
        }
    }
}
