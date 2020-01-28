import java.util.Objects;

public class Ville extends Abitazioni {
    private int nPiani;
    private double supGiardino;
    private boolean piscina;

    public Ville() {
    }

    public Ville(int nPiani, double supGiardino, boolean piscina) {
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public Ville(int nStanze, double superficie, String indirizzo, String city, int nPiani, double supGiardino, boolean piscina) {
        super(nStanze, superficie, indirizzo, city);
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public Ville(Abitazioni ab, int nPiani, double supGiardino, boolean piscina) {
        super(ab);
        this.nPiani = nPiani;
        this.supGiardino = supGiardino;
        this.piscina = piscina;
    }

    public int getnPiani() {
        return nPiani;
    }

    public void setnPiani(int nPiani) {
        this.nPiani = nPiani;
    }

    public double getSupGiardino() {
        return supGiardino;
    }

    public void setSupGiardino(double supGiardino) {
        this.supGiardino = supGiardino;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Ville{" + super.toString() +
                ", nPiani=" + nPiani +
                ", supGiardino=" + supGiardino +
                ", piscina=" + piscina +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ville ville = (Ville) o;
        return nPiani == ville.nPiani &&
                Double.compare(ville.supGiardino, supGiardino) == 0 &&
                piscina == ville.piscina;
    }
}