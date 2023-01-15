import java.util.Arrays;

public class Ship extends Transport{
    public Ship() {
        super(90);
    }


    @Override
    public String toString() {
        return "Ship{" +
                "containers=" + Arrays.toString(containers) +
                '}';
    }
}
