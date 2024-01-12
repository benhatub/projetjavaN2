import java.util.HashSet;
import java.util.Set;

public class Professeur extends Personne implements ProfesseurInterface {
    private Set<String> specialite = new HashSet<>();

    public Professeur(String nom, String prenom, int anneeNaissance, String email, String[] specialites) {
        super(nom, prenom, anneeNaissance, email);
        for (String spec : specialites) {
            this.specialite.add(spec);
        }
    }

    @Override
    public String toString() {
        return "Professeur [nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", email="
                + email + ", specialite=" + specialite + "]";
    }

    @Override
    public void enseigner() {
        System.out.println("Le professeur " + nom + " " + prenom + " enseigne.");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur " + nom + " " + prenom + " corrige un examen.");
    }
}