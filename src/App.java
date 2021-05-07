import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import javax.swing.*;
import java.awt.FlowLayout;

public class App {
    public static void main(String[] args){
        JFrame frame = new JFrame("JFrame test!");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("JFrame example!!!");
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
