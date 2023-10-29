package oop_homework4.service;

import oop_homework4.data.Teacher;
import oop_homework4.data.UserComparator;


import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>();

    public void createTeacher(String firstName, String secondName, String lastName) {
        Teacher newTeacher = new Teacher(firstName, secondName, lastName);
        teachers.add(newTeacher);
    }

    public void editTeacher(int index, String newFirstName, String newSecondName, String newLastName) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setFirstName(newFirstName);
            teacher.setSecondName(newSecondName);
            teacher.setLastName(newLastName);
        }
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }

    public List<Teacher> getTeachersSortedByLastName() {
        List<Teacher> sortedTeachers = new ArrayList<>(teachers);
        sortedTeachers.sort(new UserComparator());
        return sortedTeachers;
    }
}