package it.itis.cuneo;

public class Angolo {
    private int g;
    private int p;
    private int s;

    public Angolo(){

    }

    public Angolo(int g, int p, int s) {
        this.g = g;
        this.s = s;
        this.p = p;
    }

    public String visualizzaAngolo(){
        return "Gradi:" + this.g + " Primi:" + this.p + " Secondi:" + this.s;
    }

    public int aggiungiGradi(int n){
        int res;
        res = this.g + n;
        return res;
    }

    public int aggiungiSecondi(int n){
        int res;
        res = this.s + n;
        return res;
    }

    public int aggiungiPrimi(int n){
        int res;
        res = this.p + n;
        return res;
    }

    public String angoloSecondi(){
        int secondi;
        String risultato;
        secondi = this.s + (this.g * 3600 + this.p * 60);
        risultato = ("Il valore in secondi è: " + secondi);
        return risultato;
    }

    public String secondiAngolo(int n){
        String nuovoAngolo;
        Angolo angoloA = new Angolo();
        angoloA.s = n;
        angoloA.g = 0;
        angoloA.p = 0;
        angoloA = angoloA.correttoreGradi();
        nuovoAngolo = ("Gradi:"+ this.g + " Primi:"+ this.p + " Secondi:" + this.s);
        return nuovoAngolo;
    }

    public int differenzaSecondi(Angolo a){
        int res;
        int secondi1;
        int secondi2;
        secondi1 =this.s+ (this.g * 3600 + this.p * 60);
        secondi2 = a.s+ (a.g * 3600 + a.p * 60);
        if (secondi1>secondi2){
            res = secondi1 - secondi2;
        } else {
            res = secondi2 - secondi1;
        }

        return res;
    }

    public int sommaAngolo(Angolo a){
        int res;
        this.s =this.s+ (this.g * 3600 + this.p * 60);
        a.s = a.s+ (a.g * 3600 + a.p * 60);
        res = this.s + a.s;
        return res;
    }

    public Angolo correttoreGradi(){
        Angolo angolo1 = new Angolo();
        int ris;
        ris = 0;
        if (this.s > 59) {
            while (this.s > 59) {
                ris = ris + (this.s / 60);
            }
            this.s = this.s - (ris * 60);
            this.p = this.p + ris;
            ris = 0;
        }
        if (this.p > 59) {
            while (this.p > 59) {
                ris = ris + (this.p / 60);
            }
            this.p = this.p - (ris * 60);
            this.g = this.g + ris;
            ris = 0;
        }
        if (this.g > 359) {
            while (this.g > 359) {
                this.g = this.g - 360;
            }
        }
        angolo1.g = this.g;
        angolo1.p = this.p;
        angolo1.s = this.s;
        return angolo1;
    }

    public static void main (String[] args){
        Angolo angoloRes = new Angolo();
        Angolo angoloA = new Angolo(170,24,35);
        Angolo a = new Angolo(20,12,40);
        int n = 60;

        angoloA = angoloA.correttoreGradi();

        System.out.println("Primo Angolo (angoloA)");
        System.out.println("" + angoloA.visualizzaAngolo());

        angoloA.g = angoloA.aggiungiGradi(n);
        angoloA.p = angoloA.aggiungiPrimi(n);
        angoloA.s = angoloA.aggiungiSecondi(n);
        angoloA = angoloA.correttoreGradi();
        System.out.println("Nuovo angolo { Gradi:"+ angoloA.g+" Primi:"+angoloA.p+" Secondi:"+angoloA.s+"}");

        System.out.println(" "+ angoloA.angoloSecondi());
        System.out.println(" "+ angoloA.secondiAngolo(n));

        angoloRes.s = angoloRes.differenzaSecondi(a);
        System.out.println("Espresso in secondi la differenza" +angoloRes);

        angoloRes.s = angoloRes.sommaAngolo(a);
        angoloRes = angoloRes.correttoreGradi();
        System.out.println("Somma espressa in gradi {Gradi:"+angoloRes.g+" Primi:"+angoloRes.p+" Secondi:"+angoloRes.s+"}");
    }
}

