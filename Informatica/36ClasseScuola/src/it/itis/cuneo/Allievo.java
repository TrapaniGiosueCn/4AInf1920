package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

/**
 * Created by inf.trapanig0312 on 30/01/2020.
 */
public class Allievo {
    private String nome;
    private String cognome;
    private int informatica;
    private int matematica;
    private int storia;

    public Allievo() {
    }

    public Allievo(String nome, String cognome, int informatica, int matematica, int storia) {
        this.nome = nome;
        this.cognome = cognome;
        this.informatica = informatica;
        this.matematica = matematica;
        this.storia = storia;
    }

    public Allievo(Allievo allievo) {
        this.nome = allievo.getNome();
        this.cognome = allievo.getCognome();
        this.informatica = allievo.getInformatica();
        this.matematica = allievo.getMatematica();
        this.storia = allievo.getStoria();
    }


    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    @XmlAttribute
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getInformatica() {
        return informatica;
    }

    @XmlElement
    public void setInformatica(int informatica) {
        this.informatica = informatica;
    }

    public int getMatematica() {
        return matematica;
    }

    @XmlElement
    public void setMatematica(int matematica) {
        this.matematica = matematica;
    }

    public int getStoria() {
        return storia;
    }

    @XmlElement
    public void setStoria(int storia) {
        this.storia = storia;
    }

    @Override
    public String toString() {
        return "Allievo{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", informatica=" + informatica +
                ", matematica=" + matematica +
                ", storia=" + storia +
                '}';
    }
}
