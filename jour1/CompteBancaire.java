public static CompteBancaire {
    private int solde;
    public compteBancaire(int solde) {
        if (solde < 0) {
            System.out.println("Le solde ne peut pas être négatif.");
        } else {
        this.solde = solde;
    }
    public void deposer(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else {
        this.solde += montant;
        System.out.println("Le solde est maintenant de " + this.solde + " euros.");
        }
    }
    public void retirer(int montant) {
        if (montant < 0) {
            System.out.println("Le montant ne peut pas être négatif.");
        } else if (montant > this.solde) {
            System.out.println("Le montant ne peut pas être supérieur au solde.");
        } else {
        this.solde -= montant;
        System.out.println("Le solde est maintenant de " + this.solde + " euros.");
        }
    }
    public get_solde() {
        return this.solde;
        }
    }
}