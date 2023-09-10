import java.util.Optional;

public class OptionalExercice {
    public static void main(String[] args) {
        String input = null;
        System.out.println(getStringLength(input));
    }

    public static String getStringLength(String input) {
        return Optional.ofNullable(input)
                .map(String::length)
                .map(String::valueOf)
                .orElse("Chaîne non fournie");
    }
}
