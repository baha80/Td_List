import java.util.ArrayList; 
public class EspritArrayList implements University{
    private ArrayList<Etudiant> etudiants;
    public EspritArrayList() {
        this.etudiants = new ArrayList<Etudiant>();
    }
    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.etudiants.add(e);
    }
    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return this.etudiants.contains(e);
    }
    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : this.etudiants) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public void supprimerEtudiant(Etudiant e) {
        this.etudiants.remove(e);
    }
    @Override
    public void displayEtudiants() {
        for (Etudiant e : this.etudiants) {
            System.out.println(e.toString());
        }
    }
    @Override
    public void trierEtudiantsParId() {
        this.etudiants.sort((Etudiant e1, Etudiant e2) -> e1.getId() - e2.getId());
    }
    @Override
    public void trierEtudiantsParNom() {
        this.etudiants.sort((Etudiant e1, Etudiant e2) -> e1.getNom().compareTo(e2.getNom()));
    }
    
    
}
