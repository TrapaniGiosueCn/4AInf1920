public class ClassMain extends Thread {
    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        System.out.println("Calcolo di: (a + 4 * b)(a + 5 * b)");

        Buffer c1 = new Buffer(a,b);
        Buffer c2 = new Buffer(a,b);
        Buffer c3 = new Buffer(a,b);

        Moltiplicatore thr1 = new Moltiplicatore(c1, 4, c1.b);
        Moltiplicatore thr3 = new Moltiplicatore(c2, 5, c2.b);

        thr1.start();
        System.out.print("x1=");
        try {
            thr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr3.start();
        System.out.print("x2=");
        try {
            thr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Sommatore thr2 = new Sommatore(c1, c1.resMol, a);
        Sommatore thr4 = new Sommatore(c2, c2.resMol, a);

        thr2.start();
        System.out.print("y1=");
        try {
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr4.start();
        System.out.print("y2=");
        try {
            thr4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Moltiplicatore thr5 = new Moltiplicatore(c3, c1.resSom, c2.resSom);

        thr5.start();
        System.out.print("Il risultato totale è: ");
    }
}