package oop_homework5.Controler;

import oop_homework5.Data.*;
import oop_homework5.Service.DataService;
import oop_homework5.Service.StudyGroupService;
import oop_homework5.View.StudentView;
import oop_homework5.View.StudyGroupView;

import java.util.ArrayList;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudyGroupView studyGroupView = new StudyGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

// — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
// и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
    public StudyGroup createStudyGroupWithIds(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> students = new ArrayList<>();
        for (int studentId : studentIds) {
            students.add((Student) service.getUserById(Type.STUDENT, studentId));
        }
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public void printStudyGroupInfo(StudyGroup studyGroup) {
        studyGroupView.printOnConsoleStudyGroup(studyGroup);
    }
}


