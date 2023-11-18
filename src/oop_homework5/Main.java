package oop_homework5;

import oop_homework5.Controler.Controler;
import oop_homework5.Data.Student;
import oop_homework5.Data.StudyGroup;
import oop_homework5.Data.Teacher;

import java.util.Arrays;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();

        controler.createTeacher("Елена", "Петровна", "Сидорова", "01.01.1990");

        controler.createStudent("Иванов", "Иванович", "Иванов", "10.10.2000");
        controler.createStudent("Сергей", "Сегеевич", "Сергеев", "06.06.2000");
        controler.createStudent("Илья", "Ильич", "Ильев", "09.09.2000");



        int teacherId = 1;
        List<Integer> studentIds =  List.of(1, 2, 3);

        StudyGroup studyGroup = controler.createStudyGroupWithIds(teacherId, studentIds);
        controler.printStudyGroupInfo(studyGroup);
    }
}
