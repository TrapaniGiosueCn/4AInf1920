import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class FormPrenotazione extends JFrame implements ActionListener  {

    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JLabel labelNome;
    JLabel labelCognome;
    JLabel labelTelefono;
    JLabel labelCitta;
    JLabel labelDest;
    JLabel labelData;
    JTextField fieldNome;
    JTextField fieldCognome;
    JTextField fieldTelefono;
    JTextField fieldCitta;
    JTextField fieldDest;
    JTextField fieldData;

    public FormPrenotazione()
    {
        setTitle("Prenotazione");
        initComponets();
        setLocation(750, 250);
        setSize(400,400);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponets(){
        Container container = this.getContentPane();

        JPanel panel = new JPanel();

        labelNome = new JLabel("Nome: ");
        fieldNome = new JTextField(25);

        labelCognome = new JLabel("Cognome: ");
        fieldCognome = new JTextField(25);

        labelTelefono = new JLabel("Telefono: ");
        fieldTelefono = new JTextField(25);

        labelCitta = new JLabel("Città di partenza: ");
        fieldCitta = new JTextField(20);

        labelDest = new JLabel("Città di destinazione: ");
        fieldDest = new JTextField(20);

        labelData = new JLabel("Data: ");
        fieldData = new JTextField(25);

        panel.add(labelNome);
        panel.add(fieldNome);

        panel.add(labelCognome);
        panel.add(fieldCognome);

        panel.add(labelTelefono);
        panel.add(fieldTelefono);

        panel.add(labelCitta);
        panel.add(fieldCitta);

        panel.add(labelDest);
        panel.add(fieldDest);

        panel.add(labelData);
        panel.add(fieldData);

        container.add(panel);

        JPanel spanel = new JPanel();

        button1 = new JButton("Conferma");
        button2 = new JButton("Annulla");
        button3 = new JButton("Stampa");
        button4 = new JButton("Salva");

        spanel.add(button1);
        spanel.add(button2);
        spanel.add(button3);
        spanel.add(button4);

        container.add(spanel, BorderLayout.SOUTH);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Prenotazione a = new Prenotazione();
        if (e.getSource() == button1){
            JOptionPane.showMessageDialog(this, "Prenotazione avvenuta con successo\nGrazie " + this.fieldNome.getText());
            a.salvaSuArray(this);
            button2.setEnabled(false);
        } else if(e.getSource() == button2){
            JOptionPane.showMessageDialog(this, "Prenotazione annullata");
            svuota();
        }else if(e.getSource() == button3){
            a.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, Arrays.toString(a.array));
        }else if(e.getSource() == button4){
            a.salvaSuArray(this);
            JOptionPane.showMessageDialog(this, "Stamapto su file CSV");
            a.salvaCsv(this);
            svuota();
            button2.setEnabled(true);
        }
    }

    private void svuota() {
        fieldDest.setText("");
        fieldCitta.setText("");
        fieldTelefono.setText("");
        fieldNome.setText("");
        fieldData.setText("");
        fieldCognome.setText("");
    }

    public static void main(String[] args) {
        FormPrenotazione fp = new FormPrenotazione();
    }
}
