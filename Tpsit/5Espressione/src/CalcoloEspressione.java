public class CalcoloEspressione {
    public static void main(String[] args) {
        double a,b;
        a=6;
        b=12;
        System.out.println("Calcolo di: [4 * ( a - 2 ) + 5] * [2 * ( b - 3 ) + 4]");
        Buffer espressione = new Buffer(a,b);
        Op1 thr1 = new Op1(espressione);
        Op2 thr2 = new Op2(espressione);
        Op3 y = new Op3(espressione);

        thr1.start();
        thr2.start();
        try{
            thr1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        try{
            thr2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        y.start();
    }
}
