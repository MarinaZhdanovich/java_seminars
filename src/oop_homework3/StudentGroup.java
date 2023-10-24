package oop_homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup {
    private String groupName;
    private List<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public String getGroupName() {

        return groupName;
    }

    public void setGroupName(String groupName) {

        this.groupName = groupName;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void addStudent(Student student) {

        students.add(student);
    }

    public void removeStudent(Student student) {

        students.remove(student);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}