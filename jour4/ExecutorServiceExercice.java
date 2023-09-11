import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExercice {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        int nombre1 = Integer.parseInt(args[0]);

        Callable<Integer> multiplicationTask1 = () -> 2 * nombre1;
        Callable<Integer> multiplicationTask2 = () -> 3 * nombre1;
        Callable<Integer> multiplicationTask3 = () -> 4 * nombre1;

        FutureTask<Integer> futureTask1 = new FutureTask<>(multiplicationTask1);
        FutureTask<Integer> futureTask2 = new FutureTask<>(multiplicationTask2);
        FutureTask<Integer> futureTask3 = new FutureTask<>(multiplicationTask3);

        executor.submit(futureTask1);
        executor.submit(futureTask2);
        executor.submit(futureTask3);

        try {
            int resultat1 = futureTask1.get();
            int resultat2 = futureTask2.get();
            int resultat3 = futureTask3.get();

            System.out.println("Résultat 1 de la multiplication : " + resultat1);
            System.out.println("Résultat 2 de la multiplication : " + resultat2);
            System.out.println("Résultat 3 de la multiplication : " + resultat3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
