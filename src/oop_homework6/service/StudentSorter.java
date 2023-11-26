package oop_homework6.service;

import oop_homework6.data.Student;

import java.util.List;

public interface StudentSorter {
    List<Student> getSortedStudentBySRBall(List<Student> studentList);

    List<Student> getSortedStudentByFIO(List<Student> studentList);
}

//Принцип открытости/закрытости (Open/Closed Principle, OCP), можно расширять функциональность сортировки

