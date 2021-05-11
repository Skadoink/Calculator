import java.util.ArrayList;
import java.awt.*;
import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import javax.swing.*;

public class GUI extends JFrame {

    public static void main(String[] args){
        JFrame newFrame = new JFrame("Calculator with gridbag!"); //made window
        newFrame.setLayout(new GridBagLayout());
        newFrame.setSize(350, 500);
        newFrame.setLocationRelativeTo(null);  
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);

        GridBagConstraints gbc = new GridBagConstraints();

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(0, 3, 2, 2));
        for(Integer i=1; i < 10; i++){  //add numbers
            JButton digit = new JButton();  
            digit.setText(i.toString()); 
            digit.setPreferredSize(new Dimension(40, 50));
            numPanel.add(digit);
        }
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.5;
        gbc.weightx = 0.5;
        gbc.gridheight = 3; 
        gbc.gridwidth = 3;
        gbc.ipady = 10;
        newFrame.add(numPanel, gbc);  

        JButton zero = new JButton("0"); //add 0
        zero.setPreferredSize(new Dimension(30, 12));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.5;
        gbc.gridwidth = 1; 
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        newFrame.add(zero, gbc);

        JButton execute = new JButton(); //add exe
        execute.setText("EXE");
        execute.setPreferredSize(new Dimension(60, 12));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.gridwidth = 1; 
        gbc.gridheight = 1;
        newFrame.add(execute, gbc);

        ArrayList<String>operatorList = new ArrayList<String>(); //add operators
        Collections.addAll(operatorList, "+", "-", "*", "/", "AC", "C", "+/-"); 
        JPanel oppPanel = new JPanel();
        oppPanel.setLayout(new GridLayout(2, 4, 2, 2));
        for(Integer i = 0; i < operatorList.size(); i++){
            JButton operator = new JButton();
            operator.setText(operatorList.get(i));
            oppPanel.add(operator);
        }
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        newFrame.add(oppPanel, gbc);

        // JPanel labPanel = new JPanel();
        // JLabel label = new JLabel("JLabel example!!!"); //test label
        // labPanel.add(label);
        // gbc.fill = GridBagConstraints.BOTH;
        // gbc.gridx = 0;
        // gbc.gridy = 5;
        // gbc.gridheight = 1;
        // newFrame.add(labPanel, gbc);

        JFormattedTextField display = new JFormattedTextField();
        display.setPreferredSize(new Dimension(100, 10));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        newFrame.add(display, gbc);

    }
}
