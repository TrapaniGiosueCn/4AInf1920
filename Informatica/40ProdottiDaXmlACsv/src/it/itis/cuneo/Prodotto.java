package it.itis.cuneo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Prodotto {
    public static final String NOME_CLASSE = "Prodotto";
    private String id;
    private String name;

    public Prodotto() {
    }

    public String getId() {
        return id;
    }

    @XmlAttribute(name = "id")
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlValue
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String toRowCsv(){
        return NOME_CLASSE + Magazzino.SEPARATOR  + id + Magazzino.SEPARATOR + name ;
    }
}
