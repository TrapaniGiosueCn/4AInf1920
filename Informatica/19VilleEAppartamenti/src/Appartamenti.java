public class Appartamenti extends Abitazioni{
    private int piano;
    private boolean ascensore;
    private int nTerrazzi;

    public Appartamenti(){
    }

    public Appartamenti(int piano, boolean ascensore, int nTerrazzi) {
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamenti(int nStanze, double superficie, String indirizzo, String city, int piano, boolean ascensore, int nTerrazzi) {
        super(nStanze, superficie, indirizzo, city);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public Appartamenti(Abitazioni ab, int piano, boolean ascensore, int nTerrazzi) {
        super(ab);
        this.piano = piano;
        this.ascensore = ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public int getPiano() {
        return piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public boolean isAscensore() {
        return ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    @Override
    public String toString() {
        return "Appartamenti{" + super.toString() +
                ", piano=" + piano +
                ", ascensore=" + ascensore +
                ", nTerrazzi=" + nTerrazzi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Appartamenti that = (Appartamenti) o;
        return piano == that.piano &&
                ascensore == that.ascensore &&
                nTerrazzi == that.nTerrazzi;
    }
}
