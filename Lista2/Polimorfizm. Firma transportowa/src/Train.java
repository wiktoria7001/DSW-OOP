import java.util.Arrays;

public class Train extends Transport{
    public Train() {
        super(20);
    }

    @Override
    public String toString() {
        return "Train{" +
                "containers=" + Arrays.toString(containers) +
                '}';
    }
}
