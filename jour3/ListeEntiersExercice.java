public class ListeEntiersExercice {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Veuillez entrer des nombres en ligne de commande.");
            return;
        }

        int sommePairs = 0;

        for (String arg : args) {
            try {
                int nombre = Integer.parseInt(arg);

                if (nombre % 2 == 0) {
                    sommePairs += nombre;
                }
            } catch (NumberFormatException e) {
                System.out.println("Erreur : \"" + arg + "\" n'est pas un nombre valide.");
            }
        }

        System.out.println("Somme des nombres pairs : " + sommePairs);
    }
}
