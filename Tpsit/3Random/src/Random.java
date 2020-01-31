import java.lang.*;
import java.lang.Thread;

/**
 * Created by inf.trapanig0312 on 23/01/2020.
 */
public class Random extends Thread{
    public String name;
    public int somma;

    public void Random(String name){
        this.name = name;
        this.somma= 0;
    }

    @Override
    public void run() {
        final int MAX = 18;
        final int MIN = 12;
        int random = 0;
        while (somma<=10){
            random =(int) Math.round((Math.random()*(MAX-MIN))+MIN);
            somma = somma + random;
        }
    }

    public static void main(String[] args) {

    }
}

