public class Fattoriale extends Thread{
    double n;

    public Fattoriale(double n) {
        this.n = n;
    }

    @Override
    public void run() {
        n = n * fatt(n-1);
        System.out.print(n);
    }

    private double fatt(double v) {
        double d = 1;
        if (v >= 1){
            d = v * fatt(v-1);
        }

        return d;
    }
}
