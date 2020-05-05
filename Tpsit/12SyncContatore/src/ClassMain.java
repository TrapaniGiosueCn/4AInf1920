public class ClassMain extends Thread{
    public int contatore;
    public int cTH1;
    public int cTH2;
    public int cTH3;

    public ClassMain(int contatore) {
        this.contatore = contatore;
        this.cTH1 = 0;
        this.cTH2 = 0;
        this.cTH3 = 0;
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public static void main(String[] args){
        ClassMain cm = new ClassMain(20);

        System.out.println("Creazione dei vari ThreadDecrementatori");
        Semaforo s = new Semaforo();

        while(cm.getContatore() > 0)
        {
            ThreadDecrementatore th1 = new ThreadDecrementatore(cm, s, "TH1");
            ThreadDecrementatore th2 = new ThreadDecrementatore(cm, s, "TH2");
            ThreadDecrementatore th3 = new ThreadDecrementatore(cm, s, "TH3");

            th1.start();
            th2.start();
            th3.start();

            try {
                th1.join();
                th2.join();
                th3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nEcco i risultati\n[TH1]: "+ cm.cTH1 +"\n[TH2]: "+ cm.cTH2 +"\n[TH3]: "+ cm.cTH3);
    }
}
