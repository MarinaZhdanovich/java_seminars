package oop_homework4.view;

import oop_homework4.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnconsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher.getFirstName() + " " + teacher.getSecondName() + " " + teacher.getLastName());
        }
    }
}