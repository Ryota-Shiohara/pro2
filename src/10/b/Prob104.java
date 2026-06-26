import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prob104 {
    private JTextField field;
    private static String labelPrefix = "Total: ";
    private String input;
    private int total = 0;
    private JLabel label;

    class AddButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = field.getText();
            total += Integer.valueOf(input);
            label.setText(labelPrefix + total);
        }
    }

    class ClearButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            total = 0;
            field.setText("0");
            label.setText(labelPrefix + total);
        }
    }

    public Component createComponents() {
        field = new JTextField("0");
        JButton addButton = new JButton("Add");
        JButton clearButton = new JButton("Clear");  

        AddButtonAction addButtonListener = new AddButtonAction();
        addButton.addActionListener(addButtonListener);

        ClearButtonAction clearButtonListener = new ClearButtonAction();
        clearButton.addActionListener(clearButtonListener);

        label = new JLabel(labelPrefix + total);

        JPanel pane = new JPanel();
        JPanel buttonPane = new JPanel();
        pane.setLayout(new GridLayout(1, 2));
        buttonPane.add(addButton);
        buttonPane.add(clearButton);
        pane.setBorder(BorderFactory.createEmptyBorder( 30, 30, 10, 30 ));
        pane.setLayout(new GridLayout(0, 1));
        pane.add(field);
        pane.add(buttonPane);
        pane.add(label);

        return pane;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prob103");
        Prob104 app = new Prob104();
        Component contents = app.createComponents();
        frame.getContentPane().add(contents, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.pack();
        frame.setVisible(true);
    }
}
