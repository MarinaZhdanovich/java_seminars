package oop_homework7.controler;

import oop_homework7.model.CalculatorModel;
import oop_homework7.view.CalculatorView;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalculatorControler {
    private final CalculatorModel model;
    private final CalculatorView view;
    private static final Logger logger = Logger.getLogger(CalculatorControler.class.getName());

    public CalculatorControler(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void calculate() {
        double a = view.getUserInput("Введите первое число: ");
        double b = view.getUserInput("Введите второе число: ");

        String operation = getOperationChoice();

        double result;

        if (operation.equals("+")) {
            result = model.add(a, b);
        } else if (operation.equals("*")) {
            result = model.multiply(a, b);
        } else if (operation.equals("/")) {
            if (b != 0) {
                result = model.divide(a, b);
            } else {
                logger.warning("Попытка деления на ноль");
                System.out.println("Деление на ноль");
                return;
            }
        } else {
            logger.warning("Неверно введена операция");
            System.out.println("Неверно введена операция");
            return;
        }

        view.displayResult(result);
    }

    private String getOperationChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("+");
        System.out.println("*");
        System.out.println("/");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}