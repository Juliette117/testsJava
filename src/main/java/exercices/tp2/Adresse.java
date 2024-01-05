package exercices.tp2;

public class Adresse {

    private String voie;
    private  int rue;
    private int cp;
    private String ville;
    private String pays;



    public Adresse(String voie, int rue, int cp, String ville, String pays) {
        this.voie = voie;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public int getRue() {
        return rue;
    }

    public void setRue(int rue) {
        this.rue = rue;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
