package it.itis.cuneo;

//Trapani Giosuè

public class Barca {
    private String nome;
    private String nazionalita;
    private double lunghezza;
    private double stazza;
    private String tipo;

    public Barca() {
    }

    public Barca(String nome, String nazionalita, double lunghezza, double stazza, String tipo) {
        this.nome = nome;
        this.nazionalita = nazionalita;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tipo = tipo;
    }

    public Barca(Barca b){
        this.nome = b.getNome();
        this.nazionalita = b.getNazionalita();
        this.lunghezza = b.getLunghezza();
        this.stazza = b.getStazza();
        this.tipo = b.getTipo();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getStazza() {
        return stazza;
    }

    public void setStazza(double stazza) {
        this.stazza = stazza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barca{" + "nome='" + nome + '\'' + ", nazionalita='" + nazionalita + '\'' + ", lunghezza=" + lunghezza + ", stazza=" + stazza + ", tipologia='" + tipo + '\'' + '}';
    }

}