public class ViewString extends Thread{
    Buffer buf;
    int i;

    public ViewString(Buffer b){
        this.buf = b;
    }

    @Override
    public void run() {
        int random = (int)(3 * Math.random());
            for (i = buf.i; i > i - 1 && i>=0; i--) {
                System.out.println(buf.frase.charAt(i));
                buf.i = i;
                try {
                    Thread.sleep(random * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
