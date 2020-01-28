package it.itis.cuneo;

public class Contenitori {
    private static final int MAX_CD = 3;
    private Cd pacchetto[];

    public Contenitori(){
        Cd pacchetto[] = new Cd[MAX_CD];
        pacchetto[0] = new Cd("Cozy","Trapani",1, 160);
        pacchetto[1] = new Cd("Pray for me","Trapani",1, 170);
        pacchetto[2] = new Cd("Oasis","Trapani",1, 180);
    }

    public Contenitori(Contenitori contenitori){
        int posizione;

        pacchetto = new Cd[MAX_CD];
        for (posizione = 0; posizione< MAX_CD; posizione++){
            if (contenitori.getCd(posizione) != null)
                pacchetto[posizione] = contenitori.getCd(posizione);
        }
    }

    public int setCd(Cd cd, int posizione){
        if ((posizione<0) || (posizione >= MAX_CD))
            return -1;
        if (pacchetto[posizione] != null)
            return -2;
        pacchetto[posizione] = cd;
        return posizione;
    }

    public Cd getCd(int posizione){
        if ((posizione<0) || (posizione >= MAX_CD))
            return null;
        return pacchetto[posizione];
    }

    public int killCd(int posizione){
        if ((posizione < 0)||(posizione >= MAX_CD))
            return -1;
        if (pacchetto[posizione] == null)
            return -2;
        pacchetto[posizione] = null;
        return posizione;
    }

    public int getN(){
        int posizione, n=0;
        for (posizione=0; posizione< MAX_CD; posizione++)
            if (pacchetto[posizione] != null)
                n++;
        return n;
    }

    public String toString(){
        int posizione;
        for (posizione=0; posizione< MAX_CD; posizione++)
            if (pacchetto[posizione] != null)
                System.out.println("Denominazione: "+this.pacchetto[posizione].getTitolo() + "\n");
        return "Fine";
    }

    public static void main(String[] argv){
        Contenitori contenitore = new Contenitori();
        String s = contenitore.toString();
    }
}
