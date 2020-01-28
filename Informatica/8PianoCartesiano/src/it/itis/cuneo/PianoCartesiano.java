package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 07/10/2019.
 */
public class PianoCartesiano {
    private Rettangolo rettangolo1;
    private Rettangolo rettangolo2;

    public PianoCartesiano(){

    }

    public PianoCartesiano(Rettangolo rettangolo1, Rettangolo rettangolo2){
        this.rettangolo1=rettangolo1;
        this.rettangolo2=rettangolo2;
    }

    public String toString(){
        String vis;
        if (rettangolo2.getSegmento1().getPunto1().getX() <= rettangolo1.getSegmento1().getPunto1().getX() || rettangolo2.getSegmento2().getPunto1().getX() >= rettangolo1.getSegmento1().getPunto2().getX()){
            vis= "Il rettangolo2 interseca con il rettangolo1";
        } else {
            vis = "Il rettangolo2 non interseca con il rettangolo1";
        }
        return vis;
    }

    public String sposta(){
        int x;
        x = this.rettangolo1.getSegmento1().getPunto1().getX();
        x += 10;
        this.rettangolo1.getSegmento1().getPunto1().setX(x);

        x = this.rettangolo1.getSegmento2().getPunto1().getX();
        x += 10;
        this.rettangolo1.getSegmento2().getPunto1().setX(x);

        x = this.rettangolo1.getSegmento3().getPunto1().getX();
        x += 10;
        this.rettangolo1.getSegmento3().getPunto1().setX(x);

        x = this.rettangolo1.getSegmento4().getPunto1().getX();
        x += 10;
        this.rettangolo1.getSegmento4().getPunto1().setX(x);

        return ("\nNuove coordinate del rettangolo1 dopo averlo spostato di 10 sulle x\n {\n"+this.rettangolo1.getSegmento1().getPunto1().toString()+" \n"+ this.rettangolo1.getSegmento2().getPunto1().toString() + " \n" + this.rettangolo1.getSegmento3().getPunto1().toString() + " \n"+ this.rettangolo1.getSegmento4().getPunto1().toString() +"\n}");
    }

    public static void main(String[] args){
        Punto punto1 = new Punto(5,6);
        Punto punto2 = new Punto(5,1);
        Punto punto3 = new Punto(10,1);
        Punto punto4 = new Punto(10,6);

        Punto punto5 = new Punto(4,1);
        Punto punto6 = new Punto(4,8);
        Punto punto7 = new Punto(8,8);
        Punto punto8 = new Punto(8,1);

        Segmento segmento1 = new Segmento(punto1, punto2);
        Segmento segmento2 = new Segmento(punto2, punto3);
        Segmento segmento3 = new Segmento(punto3, punto4);
        Segmento segmento4 = new Segmento(punto4, punto1);

        Segmento segmento5 = new Segmento(punto5, punto6);
        Segmento segmento6 = new Segmento(punto6, punto7);
        Segmento segmento7 = new Segmento(punto7, punto8);
        Segmento segmento8 = new Segmento(punto8, punto5);

        Rettangolo rettangolo1 = new Rettangolo(segmento1,segmento2,segmento3,segmento4);
        Rettangolo rettangolo2 = new Rettangolo(segmento5,segmento6,segmento7,segmento8);

        PianoCartesiano piano1 = new PianoCartesiano(rettangolo1, rettangolo2);
        System.out.println(piano1.toString());

        System.out.println(piano1.sposta());
    }
}
