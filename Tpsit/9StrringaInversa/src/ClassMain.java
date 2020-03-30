public class ClassMain extends  Thread {
    public static int DELAY = 0;

    public static void main(String[] args) {

        String str = InputOutputUtility.leggiNome("Inserrire stringa: ");

        ViewChar character = new ViewChar(str, 0);
        character.start();
        try {
            character.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
