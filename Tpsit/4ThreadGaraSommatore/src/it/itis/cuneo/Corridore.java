package it.itis.cuneo;

public class Corridore extends Thread {
    private int numero;

    public Corridore() {
    }

    public Corridore(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        int num = numero ;
        while(numero == 1){
            int delay = (int) Math.round((Math.random() * (1000 - 500))+ 500);
            try {
                this.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int cnt=0;cnt<numero;cnt++){
                if(numero%cnt == 0){
                    numero = numero/cnt;
                }
            }
        }
        System.out.println(num + ": ha terminato");
    }
}
