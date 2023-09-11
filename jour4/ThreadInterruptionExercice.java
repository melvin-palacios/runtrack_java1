public class ThreadInterruptionExercice {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez spécifier la durée en secondes en tant qu'argument.");
            return;
        }

        int dureeEnSecondes = Integer.parseInt(args[0]);

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Le thread commence à dormir pendant " + dureeEnSecondes + " secondes.");
                Thread.sleep(dureeEnSecondes * 1000);
                System.out.println("Le thread a terminé son sommeil.");
            } catch (InterruptedException e) {
                System.out.println("Le thread a été interrompu après " + dureeEnSecondes/2 + " secondes.");
            }
        });

        thread.start();

        try {
            Thread.sleep(dureeEnSecondes * 500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
