public class Op3 extends Thread{
    Buffer buffer;

    public Op3(Buffer buffer1){
        buffer = buffer1;
    }

    @Override
    public void run() {
        buffer.y = buffer.th1 * buffer.th2;
        System.out.println("Risultato totale: " + buffer.y);
    }
}
