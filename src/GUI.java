import java.util.ArrayList;
import java.awt.*;
import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GUI extends JFrame {

    public static void main(String[] args){
        JFrame frame = new JFrame("Calculator!"); //made window
        frame.setLayout(new GridLayout(0, 1));

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(0, 3, 2, 2));

        JPanel labPanel = new JPanel();
        JLabel label = new JLabel("JLabel example!!!"); //test label
        labPanel.add(label);

        for(Integer i=1; i < 10; i++){  //add numbers
            JButton digit = new JButton();  
            digit.setText(i.toString()); 
            numPanel.add(digit);
        }

        JButton zero = new JButton();
        zero.setText("0");

        JButton execute = new JButton();
        execute.setText("EXE");

        ArrayList<String>operatorList = new ArrayList<String>(); //add operators
        Collections.addAll(operatorList, "+", "-", "*", "/"); 
        JPanel oppPanel = new JPanel();
        oppPanel.setLayout(new GridLayout(1, 4, 2, 2));
        for(Integer i = 0; i < operatorList.size(); i++){
            JButton operator = new JButton();
            operator.setText(operatorList.get(i));
            oppPanel.add(operator);
        }

        frame.add(numPanel);  
        frame.add(labPanel);
        frame.add(oppPanel);

        frame.setSize(350, 400);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
