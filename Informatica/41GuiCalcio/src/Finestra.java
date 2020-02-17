/**
 * Created by inf.trapanig0312 on 17/02/2020.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {

    JLabel lSquadraUno;
    JLabel lSquadraDue;
    JTextField tSquadraUno;
    JTextField tSquadraDue;
    JLabel lGoalUno;
    JLabel lGoalDue;
    JTextField tGoalUno;
    JTextField tGoalDue;
    JButton bGenera;
    JLabel lUnisciSquadre;
    JLabel lPunteggio;

    public Finestra()
    {
        setTitle("BigMatch");
        initComponets();
        pack();
        JPanel myPanel = new JPanel();
        Container container = this.getContentPane();
        container.add(myPanel);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponets() {
        // TODO Auto-generated method stub
        this.setLayout(new FlowLayout());
        lSquadraUno = new JLabel("Squadra1: ");
        this.add(lSquadraUno);
        tSquadraUno = new JTextField(20);
        this.add(tSquadraUno);
        lSquadraDue = new JLabel("Squadra2: ");
        this.add(lSquadraDue);
        tSquadraDue= new JTextField(20);
        this.add(tSquadraDue);
        lGoalUno = new JLabel("Goal squadra1: ");
        this.add(lGoalUno);
        tGoalUno = new JTextField(20);
        this.add(tGoalUno);
        lGoalDue = new JLabel("Goal squadra2: ");
        this.add(lGoalDue);
        tGoalDue= new JTextField(20);
        this.add(tGoalDue);
        bGenera= new JButton("Genera Match");
        this.add(bGenera);
        lUnisciSquadre = new JLabel("Sq.1 VS Sq.2");
        this.add(lUnisciSquadre);
        lPunteggio = new JLabel("Risultato");
        this.add(lPunteggio);
        bGenera.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        if (ae.getSource() == bGenera)
        {
            lUnisciSquadre.setText(tSquadraUno.getText()+" vs "+tSquadraDue.getText());
            lPunteggio.setText(tGoalUno.getText()+"-"+tGoalDue.getText());
        }
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}
