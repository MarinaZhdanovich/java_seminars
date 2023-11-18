package oop_homework5.View;

import oop_homework5.Data.Student;
import oop_homework5.Data.StudyGroup;
import oop_homework5.Data.Teacher;

public class StudyGroupView {
    public void printOnConsoleStudyGroup(StudyGroup studyGroup) {
        Teacher teacher = studyGroup.getTeacher();
        System.out.println("Teacher: ");
        System.out.println(teacher);

        System.out.println("Students: ");
        for (Student student : studyGroup.getStudentList()) {
            System.out.println(student);
        }
    }
}
