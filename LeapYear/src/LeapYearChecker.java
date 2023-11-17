import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;

    private int year;
    public LeapYearChecker() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    year = Integer.parseInt(textField1.getText());
                } catch (Exception xXx) {
                    JOptionPane.showMessageDialog(panel1, "Please Input Valid Year! Juice Ko!");
                    return; // Add a return statement to exit the method if the input is invalid.
                }

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    JOptionPane.showMessageDialog(panel1, "Leap Year");
                } else {
                    JOptionPane.showMessageDialog(panel1, "Not a Leap year");
                }
            }
        });
    }
    public static void main(String[] args) {
        LeapYearChecker year = new LeapYearChecker();
        year.setContentPane(year.panel1);
        year.setSize(400,400);
        year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        year.setTitle("Leap_Me_Please");
        year.setVisible(true);
    }
}
