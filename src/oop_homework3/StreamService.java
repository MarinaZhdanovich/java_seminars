package oop_homework3;

import java.util.List;

/*
— Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
 */
public class StreamService {
    public void sortStreams(List<Stream> streams) {
        StreamComparator comparator = new StreamComparator();
        streams.sort(comparator);
    }
}
