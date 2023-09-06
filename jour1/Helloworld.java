import java.util.Scanner;
public class Helloworld {
    public static void(Sting[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir votre nom:");
        String nom = scanner.nextLine();
        System.out.print("Hello," + nom + "!");
        scanner.close();
    }
}