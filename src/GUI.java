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
            numPanel.add(digit);
        }
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 60;
        gbc.weighty = 1;
        newFrame.add(numPanel, gbc);  

        JButton zero = new JButton(); //add 0
        zero.setText("0");
        JButton execute = new JButton(); //add exe
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
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 20;
        gbc.weighty = 0.5;
        newFrame.add(oppPanel, gbc);

        JPanel labPanel = new JPanel();
        JLabel label = new JLabel("JLabel example!!!"); //test label
        labPanel.add(label);
        labPanel.setSize(2, 40);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0.5;
        newFrame.add(labPanel, gbc);


    }
}
