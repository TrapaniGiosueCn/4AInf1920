package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 07/10/2019.
 */
public class Rettangolo {
    private Segmento segmento1;
    private Segmento segmento2;
    private Segmento segmento3;
    private Segmento segmento4;

    public Rettangolo(){

    }

    public Rettangolo(Segmento segmento1, Segmento segmento2, Segmento segmento3, Segmento segmento4){
        this.segmento1=segmento1;
        this.segmento2=segmento2;
        this.segmento3=segmento3;
        this.segmento4=segmento4;
    }

    public Segmento getSegmento1(){
        return segmento1;
    }

    public Segmento getSegmento2(){
        return segmento2;
    }

    public Segmento getSegmento3(){
        return segmento3;
    }

    public Segmento getSegmento4(){
        return segmento4;
    }

    public String toString(){
        float lato1;
        float lato2;
        float lato3;
        float lato4;
        float perimetro;
        float area;

        lato1= this.segmento1.lunghezza();
        lato2= this.segmento2.lunghezza();
        lato3= this.segmento3.lunghezza();
        lato4= this.segmento4.lunghezza();

        perimetro = lato1+lato2+lato3+lato4;
        area = lato1*lato2;

        return "Il perimetro vale:"+perimetro+" e l'area vale:"+area;
    }

    /*public static void main(String[] args){
        Punto punto1 = new Punto(5,6);
        Punto punto2 = new Punto(5,1);
        Punto punto3 = new Punto(10,1);
        Punto punto4 = new Punto(10,6);

        Segmento segmento1 = new Segmento(punto1, punto2);
        Segmento segmento2 = new Segmento(punto2, punto3);
        Segmento segmento3 = new Segmento(punto3, punto4);
        Segmento segmento4 = new Segmento(punto4, punto1);

        Rettangolo rettangolo1 = new Rettangolo(segmento1,segmento2,segmento3,segmento4);

        if (punto1.getX() == punto2.getX() && punto2.getY() == punto3.getY() && punto3.getX() == punto4.getX() && punto4.getY() == punto1.getY()){
            System.out.println(rettangolo1.toString());
        } else {
            System.out.println("I valori delle coordinate non vanno a costruire un rettangolo");
        }
    }*/
}
