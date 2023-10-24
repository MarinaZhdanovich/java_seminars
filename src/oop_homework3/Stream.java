package oop_homework3;

import java.util.Iterator;
import java.util.List;
/*
        — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
        Iterable позволяет объекту быть перечисляемым, элементы можно перебирать с помощью цикла for-each
*/

public class Stream implements Iterable<StudentGroup> {
    private String name;
    List<StudentGroup> studentGroups;

    public Stream(String name, List<StudentGroup> studentGroups) {
        this.name = name;
        this.studentGroups = studentGroups;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}





