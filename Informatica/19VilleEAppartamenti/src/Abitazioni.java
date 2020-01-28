import java.util.Objects;

public class Abitazioni {
    private int nStanze;
    private double superficie;
    private String indirizzo;
    private String city;

    public Abitazioni() {
    }

    public Abitazioni(int nStanze, double superficie, String indirizzo, String city) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.city = city;
    }

    public Abitazioni(Abitazioni ab) {
        this.nStanze = ab.getnStanze();
        this.superficie = ab.getSuperficie();
        this.indirizzo = ab.getIndirizzo();
        this.city = ab.getCity();
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "nStanze=" + nStanze +
                ", superficie=" + superficie +
                ", indirizzo='" + indirizzo + '\'' +
                ", city='" + city+ "'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Abitazioni that = (Abitazioni) o;
        return nStanze == that.nStanze &&
                Double.compare(that.superficie, superficie) == 0 &&
                indirizzo.equals(that.indirizzo) &&
                city.equals(that.city);
    }
}
