public class RunnableInterfaceExercice implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("En cours d'exécution...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        RunnableInterfaceExercice runnableExercice = new RunnableInterfaceExercice();
        Thread thread = new Thread(runnableExercice);
        thread.start();
    }
}
