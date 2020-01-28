package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 30/09/2019.
 */
public class Conversioni {

    //convertire da Wrapper partendo da un primitivo
    public static void main(String[] args){
        //float è una variabile di tipo primitivo
        //Float è una classe di tipo wrapper, contiene un primitivo e i metodi che ne permettono l'esecuzione
        Float f;
        f = new Float(0.52d);
        //System.out.println(String s)
        //La firma del metodo sopra richiede una stringa come parametro
        // quindi float viene convertito in una stringa al momento della chiamata
        //System.out.println(float fPrimitivo)
        //nel caso della firma sopra se passassimo un Float wrapper lui lo convertirebbe in automatico in un float
        System.out.println(f);

        int n;
        String quanteMele = "8";
        n = Integer.parseInt(quanteMele);
        System.out.println(n);

        //passare da Float a String con  i 3 metodi

        Float ogF;
        ogF = new Float(n);
        String s2;

        //Primo metodo
        s2 = "" + ogF;
        System.out.println("s2 = \"\" + ogF : " + s2);

        //Secondo metodo
        s2 = new String("" + s2);
        System.out.println("s2 = new String : " + s2);

        //Terzo metodo
        s2 = ogF.toString();
        System.out.println("s2 = ogF.toString : " + s2);

        //da double a Integer
        double dN = 7.9d;
        int intN = (int) dN;//da questo ottiene il double ma fattoa intero (detto male)
        Integer iN = new Integer(intN);
        System.out.println("Integer iN = new Integer : " + intN);//wrapper = primitivoDelloStessoTipo
    }
}
