package it.itis.cuneo;

public class Fornaio implements Pasticcere, RivenditaAlimentari {

    private boolean isFornoAcceso;

    @Override
    public void accendiForno() {
        //ereditarietà singola, infinite intefaccie da implementare
        isFornoAcceso = true;

    }

    @Override
    public void riempiMagazzino() {

    }
}
