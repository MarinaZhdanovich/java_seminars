package oop_homework6.service;

import oop_homework6.data.Student;
import oop_homework6.data.StudentGroup;
import oop_homework6.data.UserComaporator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class StudentGroupCreatorService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}

//Принцип разделения ответственности(Single Responsibility Principle) StudentGroupCreatorService отвечает только за создание группы студентов,
// а StudentGroupManagerService управляет операциями над студентами (создание, получение, сортировка
