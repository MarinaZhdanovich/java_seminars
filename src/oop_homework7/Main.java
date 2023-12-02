package oop_homework7;


import oop_homework7.controler.CalculatorControler;
import oop_homework7.model.Calculator;
import oop_homework7.model.CalculatorModel;
import oop_homework7.view.CalculatorView;
import oop_homework7.view.ConsoleCalculatorView;

import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        logger.info("Программа запущена");

        CalculatorModel model = new Calculator();
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorControler controller = new CalculatorControler(model, view);

        controller.calculate();

        logger.info("Программа завершена");
    }
}