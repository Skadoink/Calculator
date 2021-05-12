import java.util.ArrayList;
import java.awt.*;
import java.util.Collections;
import java.util.Scanner;  // Import the Scanner class
import java.lang.Math;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.Foc;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class GUI implements ActionListener, FocusListener{

    public static void main(String[] args) throws ParseException{
        JFrame newFrame = new JFrame("Calculator with gridbag!"); //made window
        newFrame.setLayout(new GridBagLayout());
        // newFrame.setSize(350, 500);
        newFrame.setLocationRelativeTo(null);  
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setVisible(true);

        GridBagConstraints gbc = new GridBagConstraints();

        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter("********************"); //set up formatiing for text field, 20 chars max
            mask.setValidCharacters("1234567890+-*/");
            String defText = "Enter calculation";
            mask.setPlaceholder(defText);
        }
        catch (ParseException e){
            e.printStackTrace();
        }

        JFormattedTextField display = new JFormattedTextField(mask); //make formatted text field
        display.addFocusListener(new FocusListener(){
            public void focusGained(FocusEvent e){
                display.setText("");
            }
            public void focusLost(FocusEvent e) {
                //nothing
            }
        });
        
        display.setPreferredSize(new Dimension(210, 20));
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        newFrame.add(display, gbc);

        JPanel numPanel = new JPanel();
        numPanel.setLayout(new GridLayout(0, 3, 2, 2));
        for(Integer i=1; i < 10; i++){  //add numbers
            JButton digit = new JButton();  
            String digitStr = i.toString();
            digit.setText(digitStr); 
            digit.setPreferredSize(new Dimension(70, 70));
            numPanel.add(digit);
            digit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    display.setText(digitStr);
                }
            });
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
        zero.setPreferredSize(new Dimension(70, 70));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0.5;
        gbc.gridwidth = 1; 
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        newFrame.add(zero, gbc);

        JButton execute = new JButton(); //add exe
        execute.setText("EXE");
        execute.setPreferredSize(new Dimension(140, 70));
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 1;
        gbc.gridwidth = 1; 
        gbc.gridheight = 1;
        newFrame.add(execute, gbc);

        ArrayList<String>operatorList = new ArrayList<String>(); //add operators
        Collections.addAll(operatorList, "+", "-", "C", "AC", "*", "/", "+/-"); 
        JPanel oppPanel = new JPanel();
        oppPanel.setLayout(new GridLayout(2, 4, 2, 2));
        for(Integer i = 0; i < operatorList.size(); i++){
            JButton operator = new JButton();
            operator.setText(operatorList.get(i));
            operator.setPreferredSize(new Dimension(52, 40));
            oppPanel.add(operator);
        }
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        newFrame.add(oppPanel, gbc);

        
       

        newFrame.pack();
    }
}
