 package it.itis.cuneo;

 /**
     * Created by inf.trapanig0312 on 31/10/2019.
     */
    public class ScatolaBottiglie {
        public static final int MAX_BOTTIGLIE = 5;
        private Bottiglia[] vBott;
        private int cBott;

        public ScatolaBottiglie(){
            //costruttore di array
            vBott = new Bottiglia[MAX_BOTTIGLIE];
            cBott=0;
        }

        public void addBott(Bottiglia bottiglia)
                throws ScatolaPienaException{
            if (cBott+1>MAX_BOTTIGLIE)
                throw new ScatolaPienaException(1, "Hai messo troppe bottiglie");
            vBott[cBott] = bottiglia;
            cBott++;
        }

        public static void main(String[] args) {
            Bottiglia bottiglia1 = new Bottiglia ("1litro");

            ScatolaBottiglie scatolaBottiglie = new ScatolaBottiglie();
            try{
                scatolaBottiglie.addBott(bottiglia1);
                scatolaBottiglie.addBott(bottiglia1);
                scatolaBottiglie.addBott(bottiglia1);
                scatolaBottiglie.addBott(bottiglia1);
            }catch (ScatolaPienaException e){
                e.printStackTrace();
                //System.out.println(e.toString());
                System.err.println(e.toString());
            }
            System.err.println(scatolaBottiglie.toString());
        }
    }
