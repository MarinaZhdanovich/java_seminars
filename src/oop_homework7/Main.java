package oop_homework7;


import oop_homework7.controler.CalculatorControler;
import oop_homework7.model.Calculator;
import oop_homework7.model.CalculatorModel;
import oop_homework7.view.CalculatorView;
import oop_homework7.view.ConsoleCalculatorView;

import java.io.IOException;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("logHomework7.txt");
        fileHandler.setLevel(Level.ALL);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        Logger logger = Logger.getLogger(Main.class.getName());
        logger.addHandler(fileHandler);

        logger.info("Программа запущена");

        CalculatorModel model = new Calculator();
        CalculatorView view = new ConsoleCalculatorView();
        CalculatorControler controller = new CalculatorControler(model, view, logger);

        controller.calculate();

        logger.info("Программа завершена");

        fileHandler.close();
    }
}