package oop_homework6.controler;

import oop_homework6.data.Student;
import oop_homework6.service.StudentGroupCreatorService;
import oop_homework6.service.StudentGroupManagerService;
import oop_homework6.view.StudentGroupView;

import java.util.List;

public class StudentGroupControler implements UserControler<Student> {
    private final StudentGroupCreatorService groupCreatorService;
    private final StudentGroupManagerService groupManagerService;
    private final StudentGroupView studentGroupView;

    public StudentGroupControler() {
        this.groupCreatorService = new StudentGroupCreatorService();
        this.groupManagerService = new StudentGroupManagerService();
        this.studentGroupView = new StudentGroupView();
    }

    public void createStudentGroup(List<Student> studentList){
        groupCreatorService.createGroup(studentList);
    }

    public List<Student> sortedStudentGroupBySRBall(List<Student> studentList) {
        return groupManagerService.getSortedStudentBySRBall(studentList);
    }

    public List<Student> sortedStudentGroupByFIO(List<Student> studentList) {
        return groupManagerService.getSortedStudentByFIO(studentList);
    }

    public void print(){
        studentGroupView.printStudentGroup(groupManagerService.getListStudent());
    }

    public void print(List<Student> list){
        studentGroupView.printStudentGroup(list);
    }

    @Override
    public Student create(String firstName, String secondName, String lastName) {
        return groupManagerService.createStudent(firstName, secondName, lastName);
    }

    public List<Student> getListStudent() {
        return groupManagerService.getListStudent();
    }
}
//Принцип инверсии зависимостей(Dependency Inversion Principle), класс использует интерфейс вместо конкретной реализации