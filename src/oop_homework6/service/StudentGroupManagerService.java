package oop_homework6.service;

import oop_homework6.data.Student;
import oop_homework6.data.StudentGroup;
import oop_homework6.data.UserComaporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupManagerService implements StudentSorter, StudentGetList{
    private StudentGroup studentGroup;

    public StudentGroupManagerService() {
        this.studentGroup = new StudentGroup(new ArrayList<>());
    }

    public Student createStudent(String firstName, String secondName, String lastName){
        int maxid = 0;
        for(Student student : studentGroup.getStudentList()) {
            if (student.getStudentId() > maxid) {
                maxid = student.getStudentId();
            }
        }
        maxid++;
        Student student = new Student(firstName, secondName, lastName, maxid, 0);
        studentGroup.addGroup(student);
        return student;
    }


    @Override
    public List<Student> getSortedStudentBySRBall(List<Student> studentList){
        List<Student> sortedList = new ArrayList<>(studentList);
        Collections.sort(sortedList);
        return sortedList;
    }

    @Override
    public List<Student> getSortedStudentByFIO(List<Student> studentList){
        List<Student> sortedList = new ArrayList<>(studentList);
        sortedList.sort(new UserComaporator());
        return sortedList;
    }

    @Override
    public List<Student> getListStudent() {
        return studentGroup.getStudentList();
    }
}

//Принцип инверсии зависимостей(Dependency Inversion Principle), класс использует интерфейсы вместо конкретной реализации