package it.itis.cuneo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by inf.trapanig0312 on 30/01/2020.
 */

@XmlRootElement
public class ClasseScuola {
    public static final String FILE_PATH = "Z:\\4_AINF\\INFORMATICA\\idea\\4AInf1920-master\\Informatica\\36ClasseScuola\\src\\classe.xml";
    private ArrayList<Allievo> allievo;

    public ClasseScuola() {
        super();
        allievo = new ArrayList<Allievo>();
    }

    public static String getFilePath() {
        return FILE_PATH;
    }

    public ArrayList<Allievo> getAllievo() {
        return allievo;
    }

    @XmlElement
    public void setAllievo(ArrayList<Allievo> allievo) {
        this.allievo = allievo;
    }

    public void unmarshallingXml() {
        try {
            File file = new File(ClasseScuola.FILE_PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(ClasseScuola.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ClasseScuola classse = (ClasseScuola) jaxbUnmarshaller.unmarshal(file);
            System.out.println(classse.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "ClasseScuola{" +
                "allievo=" + allievo +
                '}';
    }

    public static void main(String[] args) {
        ClasseScuola lamia = new ClasseScuola();

        lamia.unmarshallingXml();
    }
}
