import java.util.ArrayList;
import java.util.List;

public class MotsUniquesExercice {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez entrer des mots en ligne de commande.");
            return;
        }

        List<String> mots = new ArrayList<>();

        for (String arg : args) {
            if (!mots.contains(arg)) {
                mots.add(arg);
            }
            else if (mots.contains(arg)) {
                mots.remove(arg);
            }
        }

        String resultat = String.join(", ", mots);

        System.out.println("Mots uniques : " + resultat);
    }
}
