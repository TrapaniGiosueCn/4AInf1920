/**
 * Created by inf.trapanig0312 on 13/02/2020.
 */
public class Buffer extends Thread {
    public double resMol,resSom,resTot,a;

    public Buffer() {
        this.resMol = 0;
        this.resSom = 0;
        this.resTot = 0;
    }

    public Buffer(double a) {
        this.resMol = 0;
        this.resSom = 0;
        this.resTot = 0;
        this.a = a;
    }
}
