import java.util.*;

public class EtudiantsMapExercice {
    public static void main(String[] args) {
        Map<String, String> studentMap = new TreeMap<>();

        studentMap.put("101", "Pierre");
        studentMap.put("102", "Marie");
        studentMap.put("103", "Jean");

        for (Map.Entry<String, String> entry : studentMap.entrySet()) {
            String matricule = entry.getKey();
            String nom = entry.getValue();
            System.out.println(matricule + ": " + nom);
        }
    }
}
