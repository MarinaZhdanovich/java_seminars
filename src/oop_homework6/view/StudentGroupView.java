package oop_homework6.view;

import oop_homework6.data.Student;

import java.util.List;

public class StudentGroupView {
    public void printStudentGroup(List<Student> studentGroup){
        for (Student st: studentGroup) {
            System.out.println(st);
        }
    }
}