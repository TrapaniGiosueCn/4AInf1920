package it.itis.cuneo;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by inf.trapanig0312 on 30/10/2019.
 */
public class Libreria {
    public static final int MAX_LIBRI = 3;
    private Libro[] vLibri;
    private int cLibri;

    public Libreria(){
        //costruttore di array
        vLibri = new Libro[MAX_LIBRI];
        cLibri=0;
    }

    public void addLibro(Libro libro)
        throws LibreriaPienaException{
            if (cLibri+1>MAX_LIBRI)
                throw new LibreriaPienaException(1, "Troppi Libri!!");
        vLibri[cLibri] = libro;
        cLibri++;
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro ("Trapani", "Odio BC", "12345678910", InputOutputUtility.convertiDataOraToCalendar("30/10/2019", InputOutputUtility.dfDay));

        Libreria libreria = new Libreria();
        try{
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
            libreria.addLibro(libro1);
        }catch (LibreriaPienaException e){
            e.printStackTrace();
            //System.out.println(e.toString());
            System.err.println(e.toString());
        }
        System.err.println(libreria.toString());
    }
}
