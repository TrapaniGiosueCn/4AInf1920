/**
 * Created by inf.trapanig0312 on 17/02/2020.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Finestra extends  JFrame implements ActionListener {

    JLabel jN1;
    JLabel jN2;
    JTextField jTextNum1;
    JTextField jTextNum2;
    JButton badd;
    JButton bmin;
    JButton bprod;
    JButton bdiv;
    JLabel jRis;
    JLabel lRisultato;

    public Finestra()
    {
        setTitle("Calcolando");
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
        jN1 = new JLabel("Numero1: ");
        this.add(jN1);
        jTextNum1 = new JTextField(20);
        this.add(jTextNum1);
        jN2 = new JLabel("Numero2: ");
        this.add(jN2);
        jTextNum2= new JTextField(20);
        this.add(jTextNum2);
        badd= new JButton("+");
        this.add(badd);
        badd.addActionListener(this);
        bmin= new JButton("-");
        this.add(bmin);
        bmin.addActionListener(this);
        bprod= new JButton("*");
        this.add(bprod);
        bprod.addActionListener(this);
        bdiv= new JButton("/");
        this.add(bdiv);
        bdiv.addActionListener(this);
        jRis = new JLabel("Risultato: ");
        this.add(jRis);
        lRisultato = new JLabel();
        this.add(lRisultato);
    }

    //@Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        int n1 = new Integer(jTextNum1.getText());
        int n2 = new Integer(jTextNum2.getText());
        double ris = 0;

        if (ae.getSource() == badd)
        {
            ris = (double) n1 + n2;
            lRisultato.setText("" + ris);
        } else if (ae.getSource() == bmin)
        {
            ris = (double) n1 - n2;
            lRisultato.setText("" + ris);
        } else if (ae.getSource() == bprod)
        {
            ris = (double) n1 * n2;
            lRisultato.setText("" + ris);
        } else if (ae.getSource() == bdiv)
        {
            ris = (double) n1 / n2;
            lRisultato.setText("" + ris);
        }
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}
