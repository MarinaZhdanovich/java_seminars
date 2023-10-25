package oop_seminar4.task2.service;

import oop_seminar4.task2.data.Student;
import oop_seminar4.task2.data.StudentGroup;
import oop_seminar4.task2.data.UserComaporator;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createGroup(List<Student> studentList){
        studentGroup = new StudentGroup(studentList);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student createStudent(String firstName, String secondName, String lastName){
        if(studentGroup == null)
            createGroup(new ArrayList<>());
        int maxid = 0;
        for(Student student : studentGroup.getStudentList())
            if (student.getStudentId() > maxid)
                maxid = student.getStudentId();
        maxid++;
        Student student = new Student(firstName, secondName, lastName, maxid, 0);
        studentGroup.addGroup(student);
        return student;
    }

    public List<Student> getSortedStudentGroupBySRBall(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;

    }

    public List<Student> getListStudent(){
        return studentGroup.getStudentList();
    }

    public List<Student> getSortedStudentGroupByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComaporator());
        return studentList;
    }
}