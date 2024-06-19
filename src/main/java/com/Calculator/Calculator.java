package com.Calculator;

public class Calculator {
	public static double calculatePercentage(double part, double whole) {
        return (part / whole) * 100;
    }

    public static double calculateIncrease(double original, double increase) {
        return original + (original * (increase / 100));
    }

    public static double calculateDecrease(double original, double decrease) {
        return original - (original * (decrease / 100));
    }

    public static double findWhole(double part, double percentage) {
        return part * 100 / percentage;
    }

}
