import javax.swing.*;  
import java.awt.event.*;  

public class CalculatorGUI {  
    public static void main(String[] args) {  
        // Create a new frame
        JFrame frame = new JFrame("Calculator GUI");  
        frame.setSize(350, 300);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setLayout(null);  

        // Create components
        JLabel label1 = new JLabel("Enter first number:");  
        label1.setBounds(20, 20, 150, 20);  
        JTextField textField1 = new JTextField();  
        textField1.setBounds(150, 20, 150, 20);  

        JLabel label2 = new JLabel("Enter second number:");  
        label2.setBounds(20, 60, 150, 20);  
        JTextField textField2 = new JTextField();  
        textField2.setBounds(150, 60, 150, 20);  

        JButton addButton = new JButton("+");  
        addButton.setBounds(30, 110, 50, 30);  

        JButton subtractButton = new JButton("-");  
        subtractButton.setBounds(100, 110, 50, 30);  

        JButton multiplyButton = new JButton("*");  
        multiplyButton.setBounds(170, 110, 50, 30);  

        JButton divideButton = new JButton("/");  
        divideButton.setBounds(240, 110, 50, 30);  

        JLabel resultLabel = new JLabel("Result: ");  
        resultLabel.setBounds(20, 170, 300, 20);  

        // Add action listener for addition
        addButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                try {  
                    double num1 = Double.parseDouble(textField1.getText());  
                    double num2 = Double.parseDouble(textField2.getText());  
                    double result = num1 + num2;  
                    resultLabel.setText("Result: " + result);  
                } catch (NumberFormatException ex) {  
                    resultLabel.setText("Please enter valid numbers.");  
                }  
            }  
        });  

        // Add action listener for subtraction
        subtractButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                try {  
                    double num1 = Double.parseDouble(textField1.getText());  
                    double num2 = Double.parseDouble(textField2.getText());  
                    double result = num1 - num2;  
                    resultLabel.setText("Result: " + result);  
                } catch (NumberFormatException ex) {  
                    resultLabel.setText("Please enter valid numbers.");  
                }  
            }  
        });  

        // Add action listener for multiplication
        multiplyButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                try {  
                    double num1 = Double.parseDouble(textField1.getText());  
                    double num2 = Double.parseDouble(textField2.getText());  
                    double result = num1 * num2;  
                    resultLabel.setText("Result: " + result);  
                } catch (NumberFormatException ex) {  
                    resultLabel.setText("Please enter valid numbers.");  
                }  
            }  
        });  

        // Add action listener for division
        divideButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                try {  
                    double num1 = Double.parseDouble(textField1.getText());  
                    double num2 = Double.parseDouble(textField2.getText());  
                    if (num2 == 0) {  
                        resultLabel.setText("Cannot divide by zero.");  
                    } else {  
                        double result = num1 / num2;  
                        resultLabel.setText("Result: " + result);  
                    }  
                } catch (NumberFormatException ex) {  
                    resultLabel.setText("Please enter valid numbers.");  
                }  
            }  
        });  

        // Add components to frame
        frame.add(label1);  
        frame.add(textField1);  
        frame.add(label2);  
        frame.add(textField2);  
        frame.add(addButton);  
        frame.add(subtractButton);  
        frame.add(multiplyButton);  
        frame.add(divideButton);  
        frame.add(resultLabel);  

        // Set frame visible
        frame.setVisible(true);  
    }  
}
