package com.Calculator;

import javax.swing.SwingUtilities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class PercentageCalculatorApplication {

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                PercentageCalculator.createAndShowGUI();
	            }
	        });
//		SpringApplication.run(PercentageCalculatorApplication.class, args);
	}

}
