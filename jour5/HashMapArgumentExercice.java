import java.util.HashMap;

public class HashMapArgumentExercice {
    public static void main(String[] args) {
        HashMap<String, String> mots = new HashMap<>();
        if (args.length % 2 != 0) {
            System.out.println("Le nombre d'arguments doit être pair.");
            return;
        }
        for (int i = 0; i < args.length; i += 2) {
            String cle = args[i];
            String valeur = args[i + 1];
            mots.put(cle, valeur);
        }
        System.out.println(mots);
    }
}
