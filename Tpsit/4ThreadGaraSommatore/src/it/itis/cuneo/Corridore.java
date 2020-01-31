package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 30/01/2020.
 */
public class Corridore extends Thread {
    public static final int MIN = 0;
    public static final int MAX = 2;
    public static final int ARRIVO = 10;
    public static final int DELAY_MIN = 500;
    public static final int DELAY_MAX = 1000;
    private String nome;
    private int somma;

    public Corridore(){
        this.somma = 0;
    }

    public Corridore(String nome){
        this.nome =nome;
        this.somma = 0;
    }

    public void run(){
        int r = 0;
        int delay = 0;

        while(this.somma<= ARRIVO){
            delay = (int) Math.round((Math.random()*(DELAY_MAX-DELAY_MIN))+DELAY_MIN);
            try {
                this.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r =(int) Math.round((Math.random()*(MAX-MIN))+MIN);
            this.somma += r;
            System.out.println(this.nome + ": valore singolo:" + r +" - somma totoale:"+ this.somma + " - ritardo:" +delay+"ms");
        }
        System.out.println(this.nome + ": HO TERMINATO");
    }
}
