public class Test {

    public static void main(String[] args) {
        Ville villa = new Ville(15,500.00,"Via Roma","Cuneo",4,200.00,true);
        Appartamenti appartamento = new Appartamenti(4,30.00,"Via Roma","Cuneo",8,true,4);

        System.out.println(villa.toString());
        System.out.println(appartamento.toString());

        System.out.println(appartamento.equals(villa));
    }
}
