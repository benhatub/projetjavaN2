public class Etudiant extends Personne implements EtudiantInterface {
    private String numeroEtudiant;
    private Classe classe;

    public Etudiant(String nom, String prenom, int anneeNaissance, String email, Classe classe, int id) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = genererNumeroEtudiant(id);
    }

    private String genererNumeroEtudiant(int id) {
        return nom + nom.length() + anneeNaissance + "000" + id;
    }

    @Override
    public String toString() {
        return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", email=" + email
                + ", numeroEtudiant=" + numeroEtudiant + ", classe=" + classe + "]";
    }

    @Override
    public void sInscrire() {
        System.out.println("Inscription de l'étudiant " + nom + " " + prenom + " en classe " + classe);
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant " + nom + " " + prenom + " suit un cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant " + nom + " " + prenom + " passe un examen.");
    }
}
