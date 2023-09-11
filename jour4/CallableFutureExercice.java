import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableFutureExercice {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        int nombre1 = Integer.parseInt(args[0]);
        int nombre2 = Integer.parseInt(args[1]);

        Callable<Integer> multiplicationTask = () -> nombre1 * nombre2;

        FutureTask<Integer> futureTask = new FutureTask<>(multiplicationTask);

        executor.submit(futureTask);

        try {
            int resultat = futureTask.get();
            System.out.println("Le résultat de la multiplication est : " + resultat);
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
