import java.util.ArrayList;
import java.awt.*;
import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import javax.swing.*;

public class GUI extends JFrame {

    public static void main(String[] args){

        JPanel gbLayout = new JPanel(new GridBagLayout());
        GridBagConstraints gbConstraints = new GridBagConstraints();
        

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(0, 3, 2, 2));

        JPanel labPanel = new JPanel();
        JLabel label = new JLabel("JLabel example!!!"); //test label
        labPanel.add(label);
        labPanel.setSize(2, 40);

        for(Integer i=1; i < 10; i++){  //add numbers
            JButton digit = new JButton();  
            digit.setText(i.toString()); 
            numPanel.add(digit);
        }

        JButton zero = new JButton(); //add 0
        zero.setText("0");
        JButton execute = new JButton(); //add exe
        execute.setText("EXE");

        ArrayList<String>operatorList = new ArrayList<String>(); //add operators
        Collections.addAll(operatorList, "+", "-", "*", "/"); 
        JPanel oppPanel = new JPanel();
        oppPanel.setLayout(new GridLayout(1, 4, 2, 2));
        oppPanel.setSize(350, 50); //set size not working!
        for(Integer i = 0; i < operatorList.size(); i++){
            JButton operator = new JButton();
            operator.setText(operatorList.get(i));
            oppPanel.add(operator);
        }

        JFrame frame = new JFrame("Calculator!"); //made window
        frame.setLayout(new GridLayout(0, 1));
        frame.add(numPanel);  
        frame.add(oppPanel);
        frame.add(labPanel);

        frame.setSize(350, 500);
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
