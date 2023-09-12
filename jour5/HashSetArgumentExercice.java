import java.util.HashSet;
public class HashSetArgumentExercice {
    public static void main(String[] args) {
        HashSet<String> mots = new HashSet<>();
        for (String argument : args) {
            if(!mots.contains(argument)){
                mots.add(argument);
            }
        }
        System.out.println(mots);
    }
}