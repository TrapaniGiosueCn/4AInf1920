package it.itis.cuneo;

/**
 * Created by inf.trapanig0312 on 30/01/2020.
 */
public class PistaDiGara {
    public static void main(String[] args) {
        Corridore corridore1 = new Corridore("Fabio");
        Corridore corridore2 = new Corridore("Enrico");

        Runnable corridoreRun1Runnable = new CorridoreInterfaccia("MACCHIAVELLI");
        Thread corridoreRun1 = new Thread(corridoreRun1Runnable);

        Runnable corridoreRun2Runnable = new CorridoreInterfaccia("BOCCACCIO");
        Thread corridoreRun2 = new Thread(corridoreRun2Runnable);

        corridore1.start();
        corridore2.start();
        corridoreRun1.start();
        corridoreRun2.start();
    }
}
