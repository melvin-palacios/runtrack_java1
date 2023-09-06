public class VoitureTest {
    private String marque;
    private String couleur;
    private int vitesse;

    public Voiture(String marque, String couleur) {
        this.marque = marque;
        this.couleur = couleur;
        this.vitesse = 0;
    }

    public void demarrer() {
        Systeme.out.println("La voiture démarre.");
    }

    public void accelerer() {
        this.vitesse += 10;
        System.out.println("La vitesse est maintenant de " + this.vitesse + " km/h.");
    }

    public void freiner() {
        this.vitesse = 0;
        System.out.println("La voiture s'arrête. Vitesse est reinitialisée à 0 km/h.");
    }

    public static void main (String[] args) {
        Voiture voiture = new Voiture("BMW", "noir");
        voiture.demarrer();
        voiture.accelerer();
        voiture.accelerer();
        voiture.freiner();
    }
}