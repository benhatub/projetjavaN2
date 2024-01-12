import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Etudiant("John", "Doe", 1995, "john.doe@example.com", Classe.M1, 1));
        personnes.add(new Etudiant("Alice", "Smith", 1998, "alice.smith@example.com", Classe.L3, 2));
        personnes.add(new Etudiant("Bob", "Johnson", 1990, "bob.johnson@example.com", Classe.M2, 3));

        personnes.add(new Professeur("Dr. Smith", "Jane", 1970, "jane.smith@example.com", new String[]{"JAVA", "C#"}));
        personnes.add(new Professeur("Dr. Brown", "Michael", 1985, "michael.brown@example.com", new String[]{"PHP"}));
        personnes.add(new Professeur("Dr. White", "Emily", 1980, "emily.white@example.com", new String[]{"JAVA"}));

        for (Personne personne : personnes) {
            System.out.println(personne.toString());
        }
    }
}