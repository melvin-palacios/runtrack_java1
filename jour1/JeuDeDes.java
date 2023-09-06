import java.util.Random;

public class JeuDeDes {
    public static void main(String[] args) {
        Random random = new Random();
        int de1 = random.nextInt(6) + 1;
        int de2 = random.nextInt(6) + 1;
        int somme = de1 + de2;
        System.out.println("Le premier dé est " + de1 + ".");
        System.out.println("Le deuxième dé est " + de2 + ".");
        System.out.println("La somme est " + somme + ".");
    }
}

