package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Bicicletta {
    public static final String FILE_NAME = "C:\\Users\\giosu\\OneDrive\\Documenti\\4AInf1920-master\\IdeaProjects\\4AInf1920\\Informatica\\36Bicicletta\\src\\bicicletta.xml";
    public String telaio;
    public String freno;
    public String cambio;
    private List<Bicicletta> bicicletta;

    public Bicicletta(String telaio, String freno, String cambio){
        super();
        telaio = this.telaio;
        freno = this.freno;
        cambio = this.cambio;
        bicicletta = new ArrayList<Bicicletta>();
    }

    public Bicicletta() {
    }

    public void addRuota(Bicicletta bicicletta1){
        bicicletta.add(bicicletta1);
    }

    public String getTelaio() {
        return telaio;
    }

    @XmlElement(name="telaio")
    public void setTelaio(String telaio) {
        this.telaio = telaio;
    }

    public String getFreno() {
        return freno;
    }

    @XmlElement(name="freno")
    public void setFreno(String freno) {
        this.freno = freno;
    }

    public String getCambio() {
        return cambio;
    }

    @XmlElement(name="cambio")
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public List<Bicicletta> getBicicletta(){ return bicicletta; }

    @XmlElement(name = "ruote")
    public void setBicicletta(List<Bicicletta> bicicletta){ this.bicicletta = bicicletta;}

    @Override
    public String toString() {
        return "Bicicletta{" +
                "bicicletta=" + bicicletta +
                '}';
    }

    public String toXml() {
        String xml="";
        for(Bicicletta bicicletta : this.bicicletta){
            xml += bicicletta.toXml();
        }
        xml = "<bicicletta>\n" + xml + "</bicicletta>";
        return xml;
    }

    public void scriviXml(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FILE_NAME));
            bw.write(this.toXml());
            System.out.println(this.toXml());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void marshallingXml(){
        try {
            File file = new File(Bicicletta.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bicicletta.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    public void unmarshallingXml() {
        try {
            File file = new File(Bicicletta.FILE_NAME);
            JAXBContext jaxbContext = JAXBContext.newInstance(Bicicletta.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Bicicletta bicicletta = (Bicicletta) jaxbUnmarshaller.unmarshal(file);
            System.out.println(bicicletta);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private void simulaPercorso() {
        Bicicletta percorso = new Bicicletta("ATACA", "SHIMANO", "CAMPAGNOLA");
        Ruota ruota1 = new Ruota("ANTERIORE", "POSTERIORE");
        Bicicletta percorso2 = new Bicicletta("ATACA", "SHIMANO", "CAMPAGNOLA");
        Ruota ruota2 = new Ruota("ANTERIORE", "POSTERIORE");
        Bicicletta percorso3 = new Bicicletta("ATACA", "SHIMANO", "CAMPAGNOLA");
        Ruota ruota3 = new Ruota("ANTERIORE", "POSTERIORE");
    }

    public static void main(String[] args) {
        Bicicletta bicicletta = new Bicicletta();

        bicicletta.simulaPercorso();
        bicicletta.scriviXml();

        //bicicletta.marshallingXml();
        //bicicletta.unMarshalling();
    }
}
