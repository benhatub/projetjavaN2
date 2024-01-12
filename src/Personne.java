public class Personne {
    protected String nom;
    protected String prenom;
    protected int anneeNaissance;
    protected String email;

    public Personne(String nom, String prenom, int anneeNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", email=" + email
                + "]";
    }
}