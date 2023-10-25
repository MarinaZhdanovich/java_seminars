package oop_seminar4.task2;

import oop_seminar4.task2.controler.StudentGroupControler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupControler controler = new StudentGroupControler();
        controler.create("5","5", "5");
        controler.create("2","2", "2");
        controler.create("3","3", "3");
//        List<Student> studentList= List.of(new Student[]{student1, student2, student3});
//        controler.createStudentGroup(studentList);
        controler.print();
        System.out.println("Cортировка(SrBall)...");
        controler.print(controler.sortedStudentGroupBySrBall());
        System.out.println("Cортировка(FIO)...");
        controler.print(controler.sortedStudentGroupByFIO());
    }
}