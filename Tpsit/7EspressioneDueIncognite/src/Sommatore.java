public class Sommatore extends Thread {
    Buffer buffer;
    double n1;
    double n2;

    public Sommatore(Buffer buffer1, double nn1, double nn2) {
        buffer = buffer1;
        n1 = nn1;
        n2 = nn2;
    }

    @Override
    public void run(){
        buffer.resSom = n1 + n2;
        System.out.print(buffer.resSom + "\n");
    }
}