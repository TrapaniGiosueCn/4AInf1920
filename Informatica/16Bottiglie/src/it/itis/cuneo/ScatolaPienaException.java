package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 31/10/2019.
 */
public class ScatolaPienaException extends Exception {
    private int codice;
    private String descrizione;

    public ScatolaPienaException(int codice, String descrizione){
        this.codice = codice;
        this.descrizione = descrizione;
    }

    @Override
    public String toString(){
        return "LibreriaPienaException(" +
                "codice=" +codice +
                ", descrizione= "+ descrizione+ '\'' + "}";
    }
}