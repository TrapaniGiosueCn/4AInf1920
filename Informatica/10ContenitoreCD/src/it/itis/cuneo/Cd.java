package it.itis.cuneo;

public class Cd {
    private String titolo;
    private String autore;
    private int numeroB;
    private int durata;

    public Cd(String titolo, String autore, int numeroB, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroB = numeroB;
        this.durata = durata;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numeroB=" + numeroB +
                ", durata=" + durata +
                '}';
    }

    public Boolean compareDurata(Cd cd){
        Boolean bool;
        bool = false;

        if (this.durata == cd.getDurata())
            bool = true;

        return bool;
    }
}
