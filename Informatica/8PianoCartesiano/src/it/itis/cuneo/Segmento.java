package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 07/10/2019.
 */
public class Segmento {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Segmento(){

    }

    public Segmento(Punto punto1, Punto punto2){
        this.punto1 = new Punto(punto1.getX(), punto1.getY());
        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }

    public Punto getPunto1(){
        return this.punto1;
    }

    public Punto getPunto2(){
        return this.punto2;
    }

    public Punto getPunto3(){
        return this.punto3;
    }

    public Punto getPunto4(){
        return this.punto4;
    }

    public float lunghezza(){
        return (float) Math.sqrt(Math.pow((this.punto2.getX()-this.punto1.getX()), 2.0)+Math.pow((this.punto2.getY()-this.punto1.getY()), 2.0));
    }

    public static void main(String[] args){
        Punto punto1 = new Punto (5,6);
        Punto punto2 = new Punto (5,1);

        Segmento segmento1 = new Segmento(punto1, punto2);
        float lunghezza;
        lunghezza = segmento1.lunghezza();
        System.out.println("La lunghezza vale:"+lunghezza);
    }

}
