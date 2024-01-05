package exercices.tp2;

public abstract class Salarie {

    protected Salaire salaire;

    protected Identite identite;

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
     * Affiche la phrase 'Le salarié Jean Dupont a travaillé X heures et a perçu Y euros' dans la console
     *
     * @param heures
     * @return
     */
    public String travailler(double heures) {
        System.out.println(
                "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " a travaillé " + heures + " heures " + "et a perçu " + this.salaire.payer(heures) + " euros."
        );
        return  "Le salarié " + this.identite.getPrenom() + " " + this.identite.getNom() + " a travaillé " + heures + " heures " + "et a perçu " + this.salaire.payer(heures) + " euros.";
    }

    /**
     * Le salarié déménage
     *
     * @param adresse Adresse
     * @return
     */
    public String demenager(Adresse adresse) {
        this.identite.setAdresse(adresse);

        return null;
    }

    /**
     * Le salaire du salarie augmente selon le pourcentage
     *
     * @param pourcentage
     * @return
     */
    public void augmenter(double pourcentage) {
        this.salaire.setTauxHoraire(this.salaire.getTauxHoraire() * (1 + (pourcentage/100.0)));


    }

}
