import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final Random random = new Random();
    private final int max;
    private final int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min) + min + 1;
            }
        };
    }
}