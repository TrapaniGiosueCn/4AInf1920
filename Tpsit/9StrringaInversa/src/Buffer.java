public class Buffer extends Thread{
    String frase;
    int i;

    public Buffer(String s, int i1){
        this.i = i1;
        this.frase = s;
    }
}
