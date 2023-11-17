import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField Num1;
    private JTextField Num2;
    private JComboBox Operations;
    private JButton Equals;
    private JTextField Result;
    private JPanel Paneru;

    SimpleCalculator(){

        Equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1, n2;
                String op = null;
                try{
                    n1 = Double.parseDouble(Num1.getText());
                    op = (String) Operations.getSelectedItem();
                    n2 = Double.parseDouble(Num2.getText());
                    switch (op){
                        case "Add?":
                            Result.setText(String.valueOf(n1+n2));
                            break;
                        case "Subtract?":
                            Result.setText(String.valueOf(n1-n2));
                            break;

                        case "Multiply?":
                            Result.setText(String.valueOf(n1*n2));
                            break;

                        case "Divide?":
                            if(n2 == 0){
                                JOptionPane.showMessageDialog(Paneru, "Divisor Cannot Be Jero~");
                            }
                            double quo = n1/n2;
                            Result.setText(String.valueOf(quo));
                            break;
                    }
                }catch(Exception a){
                    JOptionPane.showMessageDialog(Paneru,"Input must be an Numeru~");
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalculator clc = new SimpleCalculator();
        clc.setContentPane(clc.Paneru);
        clc.setSize(1000,200);
        clc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        clc.setTitle("Two Nums' Operatiion");
        clc.setVisible(true);
    }
}
