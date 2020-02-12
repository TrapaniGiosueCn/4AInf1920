public class Op1  extends Thread{
    Buffer buffer;
    private double a;

    public Op1(Buffer buffer1){
        buffer = buffer1;
        a = buffer.a;
    }

    @Override
    public void run() {
        buffer.th1 = 4 * ( a - 2 ) + 5;
        System.out.println("Risultato di th1: " + buffer.th1);
    }
}
