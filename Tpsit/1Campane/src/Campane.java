package it.itis.cuneo;

public class Campane implements Runnable {
    private String suono1;
    private String suono2;
    private String suono3;


    public Campane(String suono1, String suono2, String suono3) {
        this.suono1 = suono1;
        this.suono2 = suono2;
        this.suono3 = suono3;
    }

    public String getSuono1() {
        return suono1;
    }

    public void setSuono1(String suono1) {
        this.suono1 = suono1;
    }

    public String getSuono2() {
        return suono2;
    }

    public void setSuono2(String suono2) {
        this.suono2 = suono2;
    }

    public String getSuono3() {
        return suono3;
    }

    public void setSuono3(String suono3) {
        this.suono3 = suono3;
    }

    public void run(){

    }
}

