public class GenericsExercice<T> {
    private T contenu;

    public GenericsExercice() {
        this.contenu = null;
    }

    public void ajouter(T element) {
        this.contenu = element;
    }

    public T recuperer() {
        return contenu;
    }

    public static void main(String[] args) {
        GenericsExercice<String> boiteString = new GenericsExercice<>();
        if (args.length == 0) {
            System.out.println("Veuillez entrer un mot en ligne de commande.");
            return;
        }
        boiteString.ajouter(args[0]);
        String message = boiteString.recuperer();
        System.out.println("Contenu de la boîte : " + message);
    }
}
