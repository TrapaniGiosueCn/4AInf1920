package it.itis.cuneo;

public class Suono extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Campane campana = new Campane("din","don","dan");
        Suono suono = new Suono();
        suono.start();
        for (int i=0; i<3; i++){
            System.out.println(campana.getSuono1());
            System.out.println(campana.getSuono2());
            System.out.println(campana.getSuono3());
            sleep(3000);
        }
    }
}
