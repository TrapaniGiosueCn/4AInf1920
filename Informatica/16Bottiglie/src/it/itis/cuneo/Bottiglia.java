package it.itis.cuneo;

import java.util.Calendar;

/**
 * Created by inf.trapanig0312 on 31/10/2019.
 */
public class Bottiglia {
    private String capienza;

    public Bottiglia() {
    }

    public Bottiglia(String capienza) {
        this.capienza = capienza;
    }


    public Bottiglia(Bottiglia bottiglia) {
        this.capienza = bottiglia.getCapienza();
    }

    public String getCapienza() {
        return capienza;
    }

    public void setCapienza(String capienza) {
        this.capienza = capienza;
    }

    public boolean equals(Bottiglia bottiglia){
        boolean bEquals = false;
        if (capienza != null && capienza.equals(bottiglia.getCapienza()))
        {
            bEquals=true;
        }
        return bEquals;
    }
}
