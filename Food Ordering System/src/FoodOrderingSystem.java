import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel panel1;
    private JCheckBox TEACheckBox;
    private JCheckBox SOFTDRINKCheckBox;
    private JCheckBox BURGERCheckBox;
    private JCheckBox PIZZACheckBox;
    private JRadioButton PEEPTEENOFF;
    private JRadioButton TENOFF;
    private JCheckBox SUNDAECheckBox;
    private JButton ORDER;
    private JRadioButton PAYBOFF;
    private JCheckBox FRIESCheckBox;
    private JRadioButton NONE;

    public FoodOrderingSystem() {
        ORDER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double TotalPrice = 0;
                if(PIZZACheckBox.isSelected()){
                    TotalPrice += 100;
                }
                if(BURGERCheckBox.isSelected()){
                    TotalPrice += 80;
                }
                if(FRIESCheckBox.isSelected()){
                    TotalPrice += 65;
                }
                if(SOFTDRINKCheckBox.isSelected()){
                    TotalPrice += 55;
                }
                if(TEACheckBox.isSelected()){
                    TotalPrice += 50;
                }
                if(SUNDAECheckBox.isSelected()){
                    TotalPrice += 40;
                }
                if(NONE.isSelected()){
                    JOptionPane.showMessageDialog(panel1,"The total price is Php " + TotalPrice);
                }
                if(PAYBOFF.isSelected()){
                    TotalPrice *= .95;
                    JOptionPane.showMessageDialog(panel1,"The total price is Php " + TotalPrice);
                }
                if(TENOFF.isSelected()){
                    TotalPrice *= 0.90;
                    JOptionPane.showMessageDialog(panel1,"The total price is Php " + TotalPrice);
                }
                if(PEEPTEENOFF.isSelected()){
                    TotalPrice *= 0.85;
                    JOptionPane.showMessageDialog(panel1,"The total price is Php " + TotalPrice);
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem FOOD = new FoodOrderingSystem();
        FOOD.setContentPane(FOOD.panel1);
        FOOD.setSize(500,500);
        FOOD.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FOOD.setTitle("NANI FOOD!");
        FOOD.setVisible(true);
    }
}
