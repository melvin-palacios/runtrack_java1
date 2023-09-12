import java.util.ArrayList;
import java.util.List;

public class ArrayListArgumentExercice {
    public static void main(String[] args) {
        List<String> arguments = new ArrayList<>();

        for (String argument : args) {
            arguments.add(argument);
        }

        System.out.println(arguments);
    }
}