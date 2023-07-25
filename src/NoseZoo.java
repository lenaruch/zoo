import java.util.List;

public class NoseZoo {
    private List<Speakable> speakables;

    public NoseZoo(List<Speakable> animals) {
        this.speakables = animals;
    }

    public void speakAll(){
        for (Speakable speakable: speakables){
            if (speakable instanceof Cat){
                Cat cat = (Cat) speakable;
                System.out.println(cat.getName() + " говорит: ");
            }
            speakable.speak();
        }
    }
}
