package oop_homework4.view;

import oop_homework4.data.Student;

import java.util.List;

public class StudentGroupView {
    public void printStudentGroup(List<Student> studentGroup){
        for (Student st: studentGroup) {
            System.out.println(st);
        }
    }
}