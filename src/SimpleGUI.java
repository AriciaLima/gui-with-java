import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setSize(320, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // absolute positioning

        // label sobre o campo de texto
        JLabel askNameLabel = new JLabel("What's your name?");
        askNameLabel.setBounds(20, 0, 250, 25);

        // campo de texto
        JTextField textField = new JTextField();
        textField.setBounds(20, 25, 150, 25);

        // botão
        JButton button = new JButton("Click Me");
        button.setBounds(180, 25, 90, 25);

        // adiciona componentes ao frame
        frame.add(askNameLabel);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);

        button.addActionListener(e -> {
            String name = textField.getText();
            askNameLabel.setText("Hello, " + name + "!");
        });
    }
}
