import java.util.function.Predicate;

public class LambdaArgumentExercice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Veuillez fournir une chaîne et une longueur minimale en argument.");
            return;
        }

        String inputString = args[0];
        int minLength = Integer.parseInt(args[1]);

        Predicate<String> checkLength = s -> s.length() > minLength;

        if (checkLength.test(inputString)) {
            System.out.println("La chaîne '" + inputString + "' a une longueur supérieure à " + minLength + " caractères.");
        } else {
            System.out.println("La chaîne '" + inputString + "' a une longueur de " + inputString.length() + " caractères, ce qui est inférieur ou égal à " + minLength + ".");
        }
    }
}
