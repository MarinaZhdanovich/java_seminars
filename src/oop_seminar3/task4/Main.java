package oop_seminar3.task4;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();
        Student student1 = controler.createStudent("5","5", "5", 1, 5);
        Student student2 = controler.createStudent("2","2", "2", 2, 3);
        Student student3 = controler.createStudent("3","3", "3", 3, 4);
        System.out.println(student1.compareTo(student2));
        List<Student> studentList= List.of(new Student[]{student1, student2, student3});
        controler.createStudentGroup(studentList);
        controler.print();
        System.out.println("Cортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());
        System.out.println("Cортировка(FIO)...");
        controler.print(controler.sortedStudentGroupByFIO());
    }
}