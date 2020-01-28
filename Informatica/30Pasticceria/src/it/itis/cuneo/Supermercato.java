package it.itis.cuneo;

public class Supermercato implements RivenditaAlimentari, Pasticcere {
    private int gradiFornoEletrico;

    @Override
    public void accendiForno() {
        gradiFornoEletrico = 180;
    }

    @Override
    public void riempiMagazzino() {

    }
}
