public class SynchronizationExercice extends Thread {
    private static int solde = 0;
    private int prix = 0;

    public SynchronizationExercice(int prix) {
        this.prix = prix;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Veuillez entrer le solde et le prix en ligne de commande.");
            return;
        }

        try {
            solde = Integer.parseInt(args[0]);
            int prix = Integer.parseInt(args[1]);

            Thread thread1 = new SynchronizationExercice(prix);
            Thread thread2 = new SynchronizationExercice(prix);
            thread1.start();
            thread2.start();
        } catch (NumberFormatException e) {
            System.out.println("Veuillez entrer des valeurs numériques valides pour le solde et le prix.");
        }
    }

    @Override
    public void run() {
        synchronized (SynchronizationExercice.class) {
            if (solde >= prix) {
                solde = solde - prix;
                System.out.println("Achat de " + prix + " effectué. Solde restant : " + solde);
            } else {
                System.out.println("Fonds insuffisants pour l'achat de " + prix);
            }
        }
    }
}
