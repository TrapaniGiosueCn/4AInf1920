package it.itis.cuneo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Playlist {
    public static final String FILE_PATH = "C:\\Users\\giosu\\OneDrive\\Documenti\\4AInf1920-master\\IdeaProjects\\4AInf1920\\Informatica\\35PlaylistXml\\src\\Playlist.xml";
    private List<Brano> brano;

    public Playlist(){
        super();
        brano = new ArrayList<Brano>();
    }

    public void addBrano(Brano brano){
        this.brano.add(brano);
    }

    public List<Brano> getBrano() {
        return brano;
    }

    @XmlElement
    public void setBrano(List<Brano> brano) {
        this.brano = brano;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "playlist=" + brano +
                '}';
    }

    public String toXml() {
        String xml = "";
        for(Brano brano : this.brano) {
            xml += brano.toXml();
        }
        xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"+"\n"+"<playlist>\n"
                + xml + "</playlist>";
        return xml;
    }

    public void marshallingXml(){
        try {
            //nome del file di uscita
            File file = new File(Playlist.FILE_PATH);
            //classe di cui è fatta la lista, per capire come specchiare l'oggetto
            //crea il contesto da cui nasce tutto, nuovo ambiente adatto alla classe percorso
            JAXBContext jaxbContext = JAXBContext.newInstance(Playlist.class);
            //crea marshaller tramite jaxbcontext(con singletone), marshaller = proprietà del context
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            //marshaller creato dal contesto, fare un output formattato
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //fa il marshall sia sul file che sull'output in console
            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


    private void simula() {
        Brano brano1 = new Brano(0,"Oasis", 200, "Terebro");
        this.addBrano(brano1);
        Brano brano2 = new Brano(1, "Poveri e Pazzi", 147, "Terebro");
        this.addBrano(brano2);
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.simula();
        //playlist.scriviXml();
        //Metodo di scrittura basato su jaxb
        playlist.marshallingXml();
    }
}