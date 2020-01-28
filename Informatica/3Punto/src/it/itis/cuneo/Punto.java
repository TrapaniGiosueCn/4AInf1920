package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 30/09/2019.
 */
public class Punto {

    //attributi
    private int x;
    private int y;

    //metodi
    public getPunto(){

    }

    public getPunto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x2){
        this.x = x2;
    }

    public int getX(){
        return this.x;
    }

    public void setY(int y2){
        this.y = y2;
    }

    public int getY(){
        return this.y;
    }

    public int quadrante()
    {
        int res = 4;

        if (this.x > 0 && this.y > 0) {
            res = 1;
        } else if (this.x < 0 && this.y > 0){
            res = 2;
        } else if (this.x < 0 && this.y < 0){
            res = 3;
        }

        return res;
    }
}
