import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationExercice {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(3);
        numbers.add(8);
        numbers.add(12);

        List<Integer> result = numbers.stream()
                .map(n -> n * 2)
                .filter(n -> n > 10)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
