package exercices.tp2;

public abstract class Salarie {

    private Salaire salaire;

    private Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    public Salaire getSalaire() {
        return salaire;
    }

    public void setSalaire(Salaire salaire) {
        this.salaire = salaire;
    }

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    /**
     * Retourne la phrase 'Le salarié Jean Dupont a travaillé X heures et a perçu Y euros'
     *
     * @param heures
     * @return
     */
    public String phraseTravailler(double heures) {

        return  "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " a travaillé " + heures + " heures " + "et a perçu " + this.salaire.payer(heures) + " euros.";
    }

    /**
     * Affiche la phrase 'Le salarié Jean Dupont a travaillé X heures et a perçu Y euros' dans la console
     * @param heures
     */
    public void travailler(double heures) {
        double salaire = this.salaire.payer(heures);
        System.out.println(
                "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " a travaillé " + heures + " heures " + "et a perçu " + this.salaire.payer(heures) + " euros."
        );
    }

    /** Méthode travailler() sans paramètres
     *
     */
    public void travailler() {
        this.travailler(151.67);
    }

    /**
     * Le salarié déménage
     *
     * @param adresse Adresse
     * @return
     */
    public void demenager(Adresse adresse) {
        this.identite.setAdresse(adresse);
    }

    /**
     * Le salaire du salarie augmente selon le pourcentage
     *
     * @param pourcentage
     * @return
     */
    public void augmenter(double pourcentage) {
        double augmentation = this.salaire.getTauxHoraire() * pourcentage/100;
        double nouveauSalaire = this.salaire.getTauxHoraire() + augmentation;

        this.salaire.setTauxHoraire(nouveauSalaire);


    }

}
