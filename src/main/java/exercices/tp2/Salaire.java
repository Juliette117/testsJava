package exercices.tp2;

public class Salaire {

    private static final double HEURES_TRAVAILLEES = 151;
    private double tauxHoraire;

    public Salaire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double getTauxHoraire() {
        return this.tauxHoraire;
    }




    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double payer(double heures) {
        return calculerSalaire(heures);
    }

    /**
     * Calcule le salaire en fonction du temps travaillé
     * @param heures double - Nombre d'heures travaillées
     * @return double
     */
    private double calculerSalaire(double heures) {
        if (heures > HEURES_TRAVAILLEES) {
            double salaire = 0;
            salaire += HEURES_TRAVAILLEES * this.tauxHoraire;
            salaire += (heures - HEURES_TRAVAILLEES) * this.tauxHoraire * 1.5;

            return salaire;
        } else {
            return heures * this.tauxHoraire;
        }
    }
}
