package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 07/10/2019.
 */
public class Punto {
    private int x;
    private int y;

    public Punto(){

    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        return "Valore del Punto { x:"+this.x+" y:"+ this.y+" }";
    }

    public static void main(String[] args){
        Punto punto1 = new Punto(5,6);
        Punto punto2 = new Punto(5,1);
        Punto punto3 = new Punto(10,1);
        Punto punto4 = new Punto(10,6);
        System.out.println(punto1.toString());
        System.out.println(punto2.toString());
        System.out.println(punto3.toString());
        System.out.println(punto4.toString());
    }
}
