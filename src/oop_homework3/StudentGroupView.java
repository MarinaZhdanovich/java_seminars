package oop_homework3;

import java.util.List;

public class StudentGroupView {
    public void printStreams(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println(stream.getName());
            for (StudentGroup group : stream) {
                System.out.println(group.getGroupName());
                for (Student student : group.getStudents()) {
                    System.out.println(student);
                }
            }
        }
    }
}