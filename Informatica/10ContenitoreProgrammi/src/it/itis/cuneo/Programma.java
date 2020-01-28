package it.itis.cuneo;

public class Programma {
    private String denominazione;
    private String produttore;
    private String versione;
    private String os;
    private int anno;

    public Programma(String denominazione, String produttore, String versione, String os, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.os = os;
        this.anno = anno;
    }

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Programma{" +
                "denominazione='" + denominazione + '\'' +
                ", produttore='" + produttore + '\'' +
                ", versione='" + versione + '\'' +
                ", os='" + os + '\'' +
                ", anno=" + anno +
                '}';
    }

    public Boolean compareAnno(Programma programma){
        Boolean bool;
        bool = false;

        if (this.anno == programma.getAnno())
            bool = true;

        return bool;
    }
}
