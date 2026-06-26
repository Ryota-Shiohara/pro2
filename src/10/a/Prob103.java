import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prob103 {
    private JTextField field;
    private static String labelPrefix = "New String: ";
    private String input;
    private JLabel label;

    class ButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = field.getText();
            label.setText(labelPrefix + input);
        }
    }

    public Component createComponents() {
        field = new JTextField();
        JButton button = new JButton("Move!"); 

        ButtonAction buttonListener = new ButtonAction();
        button.addActionListener(buttonListener);

        label = new JLabel(labelPrefix + "0    ");

        JPanel pane = new JPanel();
        pane.setBorder(BorderFactory.createEmptyBorder( 30, 30, 10, 30 ));
        pane.setLayout(new GridLayout(0, 1));
        pane.add(field);
        pane.add(button);
        pane.add(label);

        return pane;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prob103");
        Prob103 app = new Prob103();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.pack();
        frame.setVisible(true);
    }
}