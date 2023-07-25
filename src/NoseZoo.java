import java.util.List;

public class NoseZoo {
    private List<Speakable> speakables;

    public NoseZoo(List<Speakable> animals) {
        this.speakables = animals;
    }

    public void speakAll(){
        for (Speakable speakable: speakables){
            speakable.speak();
        }
    }
}
