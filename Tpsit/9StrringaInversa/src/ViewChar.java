import java.util.Random;

public class ViewChar extends Thread {

    // minimum and maximum delays in millis
    public static final int MIN_DELAY = 1000;
    public static final int MAX_DELAY = 3000;

    private String string;
    private int i;

    public ViewChar(String string, int i) {
        this.string = string;
        this.i = i;
    }

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "viewChar{" +
                "string='" + string + '\'' +
                ", i=" + i +
                '}';
    }

    public void run() {

        if (i < string.length()-1) {
            ViewChar character = new ViewChar(string, i + 1);
            character.start();
            try {
                character.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Random rand = new Random();
        int delay = rand.nextInt((MAX_DELAY - MIN_DELAY) + 1) + MIN_DELAY;
        try {
            sleep(delay);
            ClassMain.DELAY += delay;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("'" + string.charAt(i) + "' valore del delay: " + delay + "millis");
    }
}

