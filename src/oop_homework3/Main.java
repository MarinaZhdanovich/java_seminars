package oop_homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иван", "Иванович", "Иванов", 1, 5);
        Student student2 = new Student("Сергей", "Сергеевич", "Сергеев", 2, 4);
        Student student3 = new Student("Петр", "Петрович", "Петров", 3, 5);
        Student student4 = new Student("Сидр", "Сидорович", "Сидоров", 4, 3);
        Student student5 = new Student("Михаил", "Михайлович", "Михайлов", 5, 4);
        Student student6 = new Student("Алексей", "Алексеевич", "Алексеев", 6, 5);
        Student student7 = new Student("Николай", "Николаевич", "Николаев", 7, 4);

        StudentGroup group1 = new StudentGroup("Группа A");
        group1.addStudent(student1);
        group1.addStudent(student2);

        StudentGroup group2 = new StudentGroup("Группа B");
        group2.addStudent(student3);
        group2.addStudent(student4);

        StudentGroup group3 = new StudentGroup("Группа C");
        group3.addStudent(student5);
        group3.addStudent(student6);
        group3.addStudent(student7);

        Stream stream1 = new Stream("Поток 1", List.of(group1, group2));
        Stream stream2 = new Stream("Поток 2", List.of(group3));


        StudentGroupController controller = new StudentGroupController();

        List<Stream> streamsToSort = new ArrayList<>();   // список потоков
        streamsToSort.add(stream1);
        streamsToSort.add(stream2);

        System.out.println("До сортировки:");
        controller.printStreams(streamsToSort);

        controller.sortStreams(streamsToSort); // Сортируем потоки

        System.out.println();
        System.out.println("После сортировки:");
        controller.printStreams(streamsToSort);
    }
}





