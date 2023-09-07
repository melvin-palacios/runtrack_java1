public class CompteBancaire {
    private int solde;
    private int epargne;
    private int interet;

    public CompteBancaire(int solde, int epargne, int interet) {
        this.interet = interet;
        if (solde < 0) {
            System.out.println("Le solde ne peut pas être négatif.");
        } else {
            this.solde = solde;
        }
        if (epargne < 0) {
            System.out.println("L'épargne ne peut pas être négative.");
        } else {
            this.epargne = epargne;
        }
    }

    public void deposer(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else {
            this.solde += montant;
        }
    }

    public void deposer_epargne(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else {
            this.epargne += montant;
        }
    }

    public void retirer(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else {
            if (this.solde - montant < 0) {
                System.out.println("Le solde ne peut pas être négatif.");
            } else {
                this.solde -= montant;
            }
        }
    }

    public void retirer_epargne(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else {
            if (this.epargne - montant < 0) {
                System.out.println("L'épargne ne peut pas être négative.");
            } else {
                this.epargne -= montant;
            }
        }
    }
    public int get_solde() {
        return this.solde;
    }

    public int get_epargne() {
        return this.epargne;
    }

    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(100, 50, 5);
        compte.deposer(10);
        compte.deposer_epargne(20);
        compte.retirer(20);
        System.out.println("Solde actuel : " + compte.get_solde());
        System.out.println("Épargne actuelle : " + compte.get_epargne());
    }
}
