package oop_homework7.view;

import java.util.Scanner;

public class ConsoleCalculatorView implements CalculatorView {
    @Override
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public double getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
}