public class Semaforo{
    private int value;

    public Semaforo() {
        this.value = 1;
    }

    public synchronized void up(){
        this.value++;
        notify();
    }

    public synchronized void down(){
        while(this.value==0){
            try{
                wait();
            } catch (InterruptedException ie){}
        }
        this.value --;
    }
}