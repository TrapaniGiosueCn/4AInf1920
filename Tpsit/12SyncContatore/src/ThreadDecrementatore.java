public class ThreadDecrementatore extends Thread{
    private Semaforo sem;
    private String chiSono;
    private ClassMain cCont;
    private int varCom;
    private int volte;

    public ThreadDecrementatore(ClassMain cm,Semaforo s, String nome){
        sem = s;
        chiSono = nome;
        cCont = cm;
    }

    @Override
    public void run() {
        sem.down();
        decrementaContatore();
        sem.up();
    }

    public void decrementaContatore(){
        if (cCont.contatore == 0){
            return;
        }
        varCom = cCont.getContatore();
        varCom --;
        cCont.setContatore(varCom);
        if (chiSono == "TH1"){
            cCont.cTH1 ++;
            volte = cCont.cTH1;
        } else if(chiSono == "TH2") {
            cCont.cTH2++;
            volte = cCont.cTH2;
        } else if (chiSono == "TH3") {
            cCont.cTH3++;
            volte = cCont.cTH3;
        }

        System.out.println("["+ chiSono +"]Ciao questa è la mia "+ volte + " volta.");
        System.out.println("["+ chiSono +"] ora il contatore vale "+ varCom);
    }
}
