import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Prenotazione {
    public static final String PATH_FILE_CSV ="src\\prenotazioni.csv";
    public static final String SEPARATOR =",";
    public String array[] = new String[6];

    public void salvaSuArray(FormPrenotazione fp){
        array[0] = "Nome: " + fp.fieldNome.getText();
        array[1] = "\n" +"Cognome: " + fp.fieldCognome.getText();
        array[2] = "\n" +"Telefono: " + fp.fieldTelefono.getText();
        array[3] = "\n" +"Città di partenza: " + fp.fieldCitta.getText();
        array[4] = "\n" +"Città di destinazione" + fp.fieldDest.getText();
        array[5] = "\n" + "Data: " + fp.fieldData.getText();
    }

    public void salvaCsv(FormPrenotazione fp){
        File file = new File(PATH_FILE_CSV);
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file, true));

            bw.write(this.toRowCsv(fp));

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String toRowCsv(FormPrenotazione fp){
        return "PRENOTAZIONE" +
                "\n" + array[0] + SEPARATOR +
                "\n" + array[1] + SEPARATOR +
                "\n" + array[2] + SEPARATOR +
                "\n" + array[3] + SEPARATOR +
                "\n" + array[4] + SEPARATOR +
                "\n" + array[5] + "\n \n";
    }
}
