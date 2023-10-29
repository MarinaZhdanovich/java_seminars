package oop_homework4.view;

import oop_homework4.data.Student;

import java.util.List;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnconsole(List<Student> list) {
        for (Student student : list){
            System.out.println(student);
        }
    }
}