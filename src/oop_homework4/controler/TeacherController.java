package oop_homework4.controler;

import oop_homework4.data.Teacher;
import oop_homework4.service.TeacherService;
import oop_homework4.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    public TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();


    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        Teacher newTeacher = new Teacher(firstName, secondName, lastName);
        teacherService.createTeacher(firstName, secondName, lastName);
        return newTeacher;
    }

    public void editTeacher(int teacherIndex, String newFirstName, String newSecondName, String newLastName) {
        teacherService.editTeacher(teacherIndex, newFirstName, newSecondName, newLastName);
    }

    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    public void displayTeachers(List<Teacher> teacherList) {
        teacherView.sendOnconsole(teacherList);
    }
}



