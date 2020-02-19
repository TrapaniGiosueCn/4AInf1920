import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finestra extends  JFrame implements ActionListener {

    public Finestra()
    {
        setTitle("Finestra");
        setSize(200, 200);
        initComponets();
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponets() {
        // TODO Auto-generated method stub
        Container container = this.getContentPane();
        JPanel centerPanel = new JPanel();
        BoxLayout centerPanelLayout = new BoxLayout(centerPanel,  BoxLayout.Y_AXIS);
        centerPanel.setLayout(centerPanelLayout);
        JButton button = new JButton("button");
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton shortButton = new JButton("short");
        shortButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        JButton longButton = new JButton("long-long-long button");
        longButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(button);
        centerPanel.add(shortButton);
        centerPanel.add(longButton);
        JPanel sPanel = new JPanel();
        JButton okButton = new JButton("Ok");
        JButton deleteButton = new JButton("Delete");
        sPanel.add(okButton);
        sPanel.add(deleteButton);
        container.add(sPanel, BorderLayout.SOUTH);
        container.add(centerPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public static void main(String[] args)
    {
        Finestra fs = new Finestra();
    }
}
