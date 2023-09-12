import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class StreamMapExercice {
    public static void main(String[] args) {
        List<String> list = Arrays.stream(args)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}