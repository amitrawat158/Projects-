package com.Calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PercentageCalculator {
	
	public static void createAndShowGUI() {
        JFrame frame = new JFrame("Percentage Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel valueLabel1 = new JLabel("Value 1:");
        JTextField valueField1 = new JTextField();

        JLabel valueLabel2 = new JLabel("Value 2:");
        JTextField valueField2 = new JTextField();

        JLabel resultLabel = new JLabel("Result:");
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        String[] operations = {"Calculate Percentage", "Calculate Increase", "Calculate Decrease", "Find Whole"};
        JComboBox<String> operationBox = new JComboBox<>(operations);

        JButton calculateButton = new JButton("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value1 = Double.parseDouble(valueField1.getText());
                    double value2 = Double.parseDouble(valueField2.getText());
                    String operation = (String) operationBox.getSelectedItem();

                    double result = 0;

                    switch (operation) {
                        case "Calculate Percentage":
                            result = Calculator.calculatePercentage(value1, value2);
                            break;
                        case "Calculate Increase":
                            result = Calculator.calculateIncrease(value1, value2);
                            break;
                        case "Calculate Decrease":
                            result = Calculator.calculateDecrease(value1, value2);
                            break;
                        case "Find Whole":
                            result = Calculator.findWhole(value1, value2);
                            break;
                    }

                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input, please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(valueLabel1);
        panel.add(valueField1);
        panel.add(valueLabel2);
        panel.add(valueField2);
        panel.add(operationBox);
        panel.add(new JLabel());
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(calculateButton);

        frame.add(panel);
        frame.setVisible(true);
    }

}
