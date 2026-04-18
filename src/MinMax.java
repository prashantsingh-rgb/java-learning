import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// import javax.sound.sampled.SourceDataLine;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,12,6,67,89,43);
        Optional<Integer> result = list.stream().min((a,b)->a-b);
        result.ifPresent(System.out::println);
    }
}