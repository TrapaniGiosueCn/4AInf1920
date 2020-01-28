package it.itis.cuneo;
public class FileException extends Exception {
    private String matter ="";

    public FileException(String matter) {
        this.matter = matter;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
