package oop_homework3;

import java.util.Comparator;

/*
— Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
 */
public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        int size1 = stream1.studentGroups.size();
        int size2 = stream2.studentGroups.size();
        return Integer.compare(size1, size2); //сортирует в порядке возрастания.
    }
}
