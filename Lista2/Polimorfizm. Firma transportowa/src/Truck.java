import java.util.Arrays;

public class Truck extends Transport{
    public Truck() {
        super(1);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "containers=" + Arrays.toString(containers) +
                '}';
    }
}
