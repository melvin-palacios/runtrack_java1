import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EtudiantTest {
    private String nom;
    private List notes;

    public EtudiantTest(String nom) {
        this.nom = nom;
        this.notes = new ArrayList<>();
    }
    public void ajouterNote(double note) {
        notes.add(note);
    }

    public List getNotes() {
        return notes;
    }
    public double getNoteMax() {
        if (notes.isEmpty()) {
            return 0.0;
        }
        return Collections.max(notes);
    }
    public double getNoteMin() {
        if (notes.isEmpty()) {
            return 0.0;
        }
        return Collections.min(notes);
    }
    public double getMoyenne() {
        if (notes.isEmpty()) {
            return 0.0;
        }
        double somme = 0.0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.size();
    }
    public static void main(String[] args) {
        EtudiantTest etudiant = new EtudiantTest("Bob");
        etudiant.ajouterNote (10.0);
        etudiant.ajouterNote (12.0);
        etudiant.ajouterNote (14.0);

        etudiant.getNotes();
        etudiant.getNoteMax();
        etudiant.getNoteMin();
        etudiant.getMoyenne();
    }
}