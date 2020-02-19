public class ClassMain extends Thread {
    public static void main(String[] args) {
        double n = 4;
        System.out.println("Calcolo del fattoriale di n");

        Buffer c1 = new Buffer(n);

        Fattoriale thr1 = new Fattoriale(n);

        thr1.start();
        System.out.print("fatt=");
    }
}