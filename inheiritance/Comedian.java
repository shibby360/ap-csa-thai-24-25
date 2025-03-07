import java.util.ArrayList;
public class Comedian extends Performer {
    private ArrayList<String> jokes;
    public Comedian(String nm, int a, String h, String ag) {
        super(nm, a, h, ag);
        jokes = new ArrayList<String>();
    }
    public void addJoke(String joke) {
        jokes.add(joke);
    }
    public void perform() {
        super.perform();
        for(String x : jokes) {
            System.out.println(x + " 🤣");
        }
    }
    public void fartNoise() {
        System.out.println("PffffBLFPBPPPPPlbpbplff");
    }
}