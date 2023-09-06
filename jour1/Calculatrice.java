import java.util.Scanner;

public static Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir le premier nombre:");
        int a = scanner.nextInt();
        System.out.print("Veuillez saisir le deuxième nombre:");
        int b = scanner.nextInt();
        System.out.print("Somme:" + (a + b));
        System.out.print("Différence:" + (a - b));
        System.out.print("Produit:" + (a * b));
        System.out.print("Quotient:" + (a / b));
    }
}