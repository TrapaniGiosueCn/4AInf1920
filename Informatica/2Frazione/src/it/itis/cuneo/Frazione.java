package it.itis.cuneo;

public class Frazione {
    //attributi
    private int num;

    //metodi
    public Frazione(int num) {this.num = num;}

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    //main come se fosse esterno alla classe
    public static void main (String[] args){
        float x;
        float y;

        Frazione numer = new Frazione(numer: 2);
        Frazione den = new Frazione(den: 9);

        x = numer.getNum();
        y = den.getNum();

        System.out.println("Frazione 1:");

        System.out.println(x);
        System.out.println(y);

        float x2;
        float y2;

        Frazione numerDue = new Frazione (numerDue: 13);
        Frazione denDue = new Frazione (denDue: 10);

        x2 = numerDue.getNum();
        y2 = denDue.getNum();

        System.out.println("Frazione 2:");

        System.out.println(x2);
        System.out.println(y2);

        float somma = ((x/y) + (x2/y2));
        System.out.println("La somma:");
        System.out.println(somma);

        float moltiplicazione = ((x/y)*(x2/y2));
        System.out.println("La moltiplicazione:");
        System.out.println(moltiplicazione);

        float divisione = ((x/y)/(x2/y2));
        System.out.println("La divisione:");
        System.out.println(divisione);
    }
}
