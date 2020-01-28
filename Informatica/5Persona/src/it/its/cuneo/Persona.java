package it.its.cuneo;

public class Persona {
    //attributi
    private int eta;
    private String nome;
    private String sesso;
    private String professione;

    //metodi
    public Persona(){

    }

    public Persona(String nome, int eta, String sesso, String professione){
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.professione = professione;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public int getEta(){
        return this.eta;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSesso(String sesso){
        this.sesso = sesso;
    }

    public String getSesso(){
        return this.sesso;
    }

    public void setProfessione(String professione){
        this.professione = professione;
    }

    public String getProfessione(){
        return this.professione;
    }

    public String chiSei(){
        String stringa = ("Sono una persona di nome: "+ this.nome +", sesso: "+ this.sesso + ", età: "+ this.eta + ", professione: "+ this.professione);
        return stringa;
    }

    public static void main(String[] args){
        String stringa;
        Persona personaA = new Persona("Giosuè",17,"M","Studente");
        Persona personaB = new Persona("Giovanni", 19, "M", "Studente");

        stringa = personaA.chiSei();
        System.out.println(" "+ stringa);

        stringa = personaB.chiSei();
        System.out.println(" "+ stringa);
    }

    }
