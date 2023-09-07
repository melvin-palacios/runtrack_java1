import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le premier nombre: ");
        int num1 = scanner.nextInt();
        System.out.print("Veuillez saisir le deuxième nombre: ");
        int num2 = scanner.nextInt();

        System.out.println("Somme: " + (num1 + num2));
        System.out.println("Différence: " + (num1 - num2));
        System.out.println("Produit: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quotient: " + ((double) num1 / num2));
        } else {
            System.out.println("Quotient: Division by zero is not allowed.");
        }
    }
}
