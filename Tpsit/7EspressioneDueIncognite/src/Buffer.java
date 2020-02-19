public class Buffer extends Thread {
    public double resMol,resSom,resTot,a, b;

    public Buffer() {
        this.resMol = 0;
        this.resSom = 0;
        this.resTot = 0;
    }

    public Buffer(double a, double b) {
        this.resMol = 0;
        this.resSom = 0;
        this.resTot = 0;
        this.a = a;
        this.b = b;
    }
}
