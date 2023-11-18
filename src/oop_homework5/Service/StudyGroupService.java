package oop_homework5.Service;

import oop_homework5.Data.Student;
import oop_homework5.Data.StudyGroup;
import oop_homework5.Data.Teacher;
import java.util.List;

//— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>))
// формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}