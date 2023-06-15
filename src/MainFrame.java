import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel jsFirstName;
    private JTextField textField1;
    private JButton clickMeButton;
    private JPanel MainPanel;

    /**
     * Frame Params
     * Frame titel,
     * action if click x in top right,
     * Frame size
     * Window position
     * Frame visibility
     */
    public MainFrame() {
        setContentPane(MainPanel);
        setTitle("Simple GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        /**
         * listener for the button -> what happens if button is clicked
         */
        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /* get the Value from the firstName textField */
                String firstName = textField1.getText();

                /* show info panel after button clicked */
                JOptionPane.showMessageDialog(MainFrame.this, "Welcome " + firstName);
            }
        });
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
