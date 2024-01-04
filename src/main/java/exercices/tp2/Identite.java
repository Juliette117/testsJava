package exercices.tp2;

public class Identite {

    private String nom;
    private  String prenom;
    private Adresse adresse;

    public Identite(String nom, String prenom, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }



    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getIdentite() {
        return this.nom + ' ' + this.prenom + ' ' + this.adresse;
    }


}
