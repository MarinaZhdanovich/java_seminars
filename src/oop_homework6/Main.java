package oop_homework6;
import oop_homework6.controler.StudentGroupControler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();
        controler.create("Иван", "Иванович", "Иванов");
        controler.create("Сергей", "Сергеевич", "Сергеев");
        controler.create("Петр", "Петрович", "Петров");

        controler.print();
        System.out.println();
        System.out.println("Сортировка SrBall");
        controler.print(controler.sortedStudentGroupBySRBall(controler.getListStudent()));

        System.out.println();
        System.out.println("Сортировка FIO");
        controler.print(controler.sortedStudentGroupByFIO(controler.getListStudent()));
    }
}