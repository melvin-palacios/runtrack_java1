import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectExercice {
    public static void main(String[] args) {
        int nombre1 = Integer.parseInt(args[0]);
        List<Integer> nombres = Arrays.stream(args)
                .skip(1)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Nombres inferieur à " + nombre1 + ":");
        List<Integer> nombresFiltres = nombres.stream()
                .filter(nombre -> nombre < nombre1)
                .collect(Collectors.toList());
        System.out.println(nombresFiltres);
    }
}