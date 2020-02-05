package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Magazzino {
    public static final String NOME_CLASSE = "Magazzino";
    public static final String SEPARATOR = ",";
    public static final String PATH_XML = "C:\\Users\\giosu\\OneDrive\\Documenti\\4AInf1920-master\\IdeaProjects\\4AInf1920\\Informatica\\40ProdottiDaXmlACsv\\src\\prodottoXml.xml";
    public static final String PATH_CSV = "C:\\Users\\giosu\\OneDrive\\Documenti\\4AInf1920-master\\IdeaProjects\\4AInf1920\\Informatica\\40ProdottiDaXmlACsv\\src\\prodottoCsv.csv";
    private String name;
    private List<Prodotto> lProdotto;

    public Magazzino() {
        lProdotto = new ArrayList<Prodotto>();
    }

    public String getName() {
        return name;
    }

    @XmlAttribute(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public List<Prodotto> getlProdotto() {
        return lProdotto;
    }

    @XmlElement
    public void setlProdotto(List<Prodotto> lProdotto) {
        this.lProdotto = lProdotto;
    }

    @Override
    public String toString() {
        return "Magazzino{" +
                "name='" + name + '\'' +
                ", lProdotto=" + lProdotto +
                '}';
    }

    public String toRowCsv(){
            return NOME_CLASSE + SEPARATOR + name;
    }

    public void unmarshall(){
        File file = new File(PATH_XML);
        JAXBContext jaxbContext = null;
        Magazzino magazzino = null;

        try{
            jaxbContext = JAXBContext.newInstance(Magazzino.class);
            Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();

            magazzino = (Magazzino) jaxbunmarshaller.unmarshal(file);

            this.name= magazzino.name;
            this.lProdotto  = magazzino.lProdotto;

            System.out.println(magazzino.toString());
        }catch(JAXBException e){
            e.printStackTrace();
        }
    }

    public void marshall(){
        File file = new File(PATH_XML);
        JAXBContext jaxbContext = null;

        try{
            jaxbContext = JAXBContext.newInstance(Magazzino.class);
            Marshaller jaxbmarshaller = jaxbContext.createMarshaller();
            jaxbmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbmarshaller.marshal(this, file);
            jaxbmarshaller.marshal(this, System.out);
        }catch(JAXBException e){
            e.printStackTrace();
        }
    }

    public void salvaCsv(){
        File file = new File(PATH_CSV);
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(this.toRowCsv());
            for (Prodotto prodotto : this.getlProdotto()){
                bw.write(this.toRowCsv());
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Magazzino m1 = new Magazzino();

        m1.unmarshall();

        m1.salvaCsv();
    }
}
