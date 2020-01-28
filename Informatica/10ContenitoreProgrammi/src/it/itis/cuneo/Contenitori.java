package it.itis.cuneo;

public class Contenitori {
    private static final int MAX_PROG = 3;
    private Programma pacchetto [];

    public Contenitori(){
		Programma pacchetto[] = new Programma[MAX_PROG];
		pacchetto[0] = new Programma("Gioco","Trapani","V 1.1", "Win, Linux", 2019);
		pacchetto[1] = new Programma("App","Trapani","V 2.2.", "Win, Linux", 2020);
		pacchetto[2] = new Programma("Social","Trapani","V 3.3", "Win, Linux", 2021);
    }

    public Contenitori(Contenitori contenitori){
	int posizione;

	pacchetto = new Programma[MAX_PROG];
	for (posizione = 0; posizione<MAX_PROG; posizione++){
	    if (contenitori.getProgramma(posizione) != null)
		pacchetto[posizione] = contenitori.getProgramma(posizione);
	}
    }

    public int setProgramma(Programma programma, int posizione){
	if ((posizione<0) || (posizione >= MAX_PROG))
	    return -1;
	if (pacchetto[posizione] != null)
	    return -2;
	pacchetto[posizione] = programma;
	return posizione;
    }

    public Programma getProgramma(int posizione){
	if ((posizione<0) || (posizione >=MAX_PROG))
	    return null;
	return pacchetto[posizione];
    }

    public int killPrograma(int posizione){
	if ((posizione < 0)||(posizione >= MAX_PROG))
	    return -1;
	if (pacchetto[posizione] == null)
	    return -2;
	pacchetto[posizione] = null;
	return posizione;
    }

    public int getN(){
	int posizione, n=0;
	for (posizione=0; posizione<MAX_PROG; posizione++)
	    if (pacchetto[posizione] != null)
		n++;
	return n;
    }

    public String toString(){
	int posizione;
	for (posizione=0; posizione<MAX_PROG; posizione++)
	    if (pacchetto[posizione] != null)
			System.out.println("Denominazione: "+this.pacchetto[posizione].getDenominazione() + "\n");
	return "Fine";
    }

    public static void main(String[] argv){
    Contenitori contenitore = new Contenitori();
	String s = contenitore.toString();
    }
	
}
