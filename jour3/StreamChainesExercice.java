import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChainesExercice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);

        List<String> result = words.stream()
                .filter(word -> word.startsWith("a") && word.length() == 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
