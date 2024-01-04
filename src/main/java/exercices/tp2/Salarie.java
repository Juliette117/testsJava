package exercices.tp2;

public abstract class Salarie {

    protected Salaire salaire;

    protected Identite identite;

    public Salarie(Salaire salaire, Identite identite) {
        this.salaire = salaire;
        this.identite = identite;
    }

    /**
     * Le salarié travaille
     * @param heures
     */
    public void travailler(double heures) {

    }

    /**
     * Le salarié déménage
     * @param adresse Adresse - Changement d'adresse
     */
    public void demenager(Adresse adresse) {
        this.identite.setAdresse(adresse);
    }

    public void augmenter(double pourcentage) {
        this.salaire.setTauxHoraire(pourcentage);

    }

}
