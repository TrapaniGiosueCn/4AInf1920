public class ClassMain extends  Thread {
    public static void main(String[] args) {
        String frase = "Prova1";

        Buffer b = new Buffer(frase, frase.length()-1);
        for (int i=0; i<frase.length()-1; i++){
            ViewString vs = new ViewString(b);
                vs.start();
                try {
                    vs.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
