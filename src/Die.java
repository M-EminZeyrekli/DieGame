import java.util.Random;

public class Die {
    public int nextRoll() {
        Random r = new Random();
        int number = r.nextInt(7);

        return number;
    }

}