/**
 * Created by inf.trapanig0312 on 13/02/2020.
 */
public class GPrec extends Thread {
    public static void main(String[] args) {
        double a = 2;
        System.out.println("Calcolo di: [ (a * 6) +3 ] * 2 + [ (a*3) + 4 ] * 5 ");

        Buffer c1 = new Buffer(a);
        Buffer c2 = new Buffer(a);
        Buffer c3 = new Buffer(a);

        Moltiplicatore thr1 = new Moltiplicatore(c1, c1.a, 6);
        Moltiplicatore thr4 = new Moltiplicatore(c2, c2.a, 3);

        thr1.start();
        System.out.print("x1=");
        try {
            thr1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr4.start();
        System.out.print("x2=");
        try {
            thr4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Sommatore thr2 = new Sommatore(c1, c1.resMol, 3);
        Sommatore thr5 = new Sommatore(c2, c2.resMol, 4);

        thr2.start();
        System.out.print("y1=");
        try {
            thr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr5.start();
        System.out.print("y2=");
        try {
            thr5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Moltiplicatore thr3 = new Moltiplicatore(c1, c1.resSom, 2);
        Moltiplicatore thr6 = new Moltiplicatore(c2, c2.resSom, 5);

        thr3.start();
        System.out.print("z1=");
        try {
            thr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thr6.start();
        System.out.print("z2=");
        try {
            thr6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Sommatore thr7 = new Sommatore(c3, c1.resMol, c2.resMol);

        thr7.start();
        System.out.print("Il risultato totale è: ");
    }
}
