import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends  JFrame implements ActionListener {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    public Finestra()
    {
        setTitle("Finestra");
        initComponets();
        setSize(300,300);
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
            button1.setText(toggle(button1.getText()));
        } else if (e.getSource() == button2){
            button2.setText(toggle(button2.getText()));
        } else if (e.getSource() == button3){
            button3.setText(toggle(button3.getText()));
        } else if (e.getSource() == button4){
            button4.setText(toggle(button4.getText()));
        } else if (e.getSource() == button5){
            button5.setText(toggle(button5.getText()));
        } else if (e.getSource() == button6){
            button6.setText(toggle(button6.getText()));
        } else if (e.getSource() == button7){
            button7.setText(toggle(button7.getText()));
        } else if (e.getSource() == button8){
            button8.setText(toggle(button8.getText()));
        } else if (e.getSource() == button9){
            button9.setText(toggle(button9.getText()));
        }
    }

    private String toggle(String str) {
        String ret = "";

        if (str == ""){
            ret = "X";
        }else if (str == "X"){
            ret = "O";
        } else if (str == "O"){
            ret = "X";
        }

        return ret;
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}