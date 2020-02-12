public class Op2  extends Thread{
    Buffer buffer;
    private double b;

    public Op2(Buffer buffer1){
        buffer = buffer1;
        b = buffer.b;
    }

    @Override
    public void run() {
        buffer.th2 = 2 * ( b - 3 ) + 4;
        System.out.println("Risultato di th2: " + buffer.th2);
    }
}