/**
 * Created by inf.trapanig0312 on 20/02/2020.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Finestra extends  JFrame implements ActionListener {
    public static final String PATH_FILE_CSV ="src\\griglia.csv";
    public static final String SEPARATOR =",";

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton newGame;
    private String cont;

    public Finestra()
    {
        cont = "";
        setTitle("Tris");
        initComponets();
        setLocation(750, 250);
        setSize(400,400);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponets() {
        // TODO Auto-generated method stub
        Container container = this.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        button1 = new JButton("");
        button2 = new JButton("");
        button3 = new JButton("");
        button4 = new JButton("");
        button5 = new JButton("");
        button6 = new JButton("");
        button7 = new JButton("");
        button8 = new JButton("");
        button9 = new JButton("");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        container.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            button1.setText(tris(button1.getText()));
            controllo();
        } else if (e.getSource() == button2){
            button2.setText(tris(button2.getText()));
            controllo();
        } else if (e.getSource() == button3){
            button3.setText(tris(button3.getText()));
            controllo();
        } else if (e.getSource() == button4){
            button4.setText(tris(button4.getText()));
            controllo();
        } else if (e.getSource() == button5){
            button5.setText(tris(button5.getText()));
            controllo();
        } else if (e.getSource() == button6){
            button6.setText(tris(button6.getText()));
            controllo();
        } else if (e.getSource() == button7){
            button7.setText(tris(button7.getText()));
            controllo();
        } else if (e.getSource() == button8){
            button8.setText(tris(button8.getText()));
            controllo();
        } else if (e.getSource() == button9){
            button9.setText(tris(button9.getText()));
            controllo();
        } else if (e.getSource() == newGame){
            nuovaPartita();
        }
    }

    private String tris(String string) {

        String ret = string;
        if (cont == "") {
            if (string == ""){
                ret = "X";
                cont = "X";
            }
        } else if (cont == "X"){
            if (string == ""){
                ret = "O";
                cont = "O";
            }
        }

        return ret;
    }

    private void controllo(){

        if (((button1.getText() == button2.getText()) && (button2.getText() == button3.getText())) || ((button1.getText() == button5.getText()) && (button5.getText() == button9.getText())) || ((button1.getText() == button4.getText()) && (button4.getText() == button7.getText()))){
            if (button1.getText() == "X"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 1", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            } else if (button1.getText() == "O"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 2", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            }

        } else if (((button2.getText() == button5.getText()) && (button5.getText() == button8.getText())) || ((button4.getText() == button5.getText()) && (button5.getText() == button6.getText())) || ((button3.getText() == button5.getText()) && (button5.getText() == button7.getText()))){
            if (button5.getText() == "X"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 1", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            } else if (button5.getText() == "O"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 2", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            }

        } else if (((button7.getText() == button8.getText()) && (button8.getText() == button9.getText())) || ((button3.getText() == button6.getText()) && (button6.getText() == button9.getText()))){
            if (button9.getText() == "X"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 1", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            } else if (button9.getText() == "O"){
                Object[] options = { "Nuova Partita"};
                JOptionPane.showOptionDialog(this, "Ha vinto il player 2", "Vincitore!!",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                nuovaPartita();
            }else if (((button2.getText() == button3.getText()) && (button3.getText() == button4.getText()))){
                if (button2.getText() == "X"){
                    Object[] options = { "Nuova Partita"};
                    JOptionPane.showOptionDialog(this, "Ha vinto il player 1", "Vincitore!!",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                    nuovaPartita();
                } else if (button2.getText() == "O") {
                    Object[] options = {"Nuova Partita"};
                    JOptionPane.showOptionDialog(this, "Ha vinto il player 2", "Vincitore!!",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                    nuovaPartita();
                }
            }
        }
    }

    private void nuovaPartita() {
        salvaCsv();
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        cont = "";

        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }

    public void salvaCsv(){
        File file = new File(PATH_FILE_CSV);
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file, true));

            bw.write(this.toRowCsv());

            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String toRowCsv(){
        return "PARTITA" +
                "\n" +button1.getText() + SEPARATOR + button2.getText() + SEPARATOR + button3.getText() +
                "\n" + button4.getText() + SEPARATOR + button5.getText() + SEPARATOR + button6.getText() +
                "\n" + button7.getText() + SEPARATOR + button8.getText() + SEPARATOR + button9.getText() + "\n\n";
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}