package oop_homework3;

import java.util.List;
/*
— Модифицировать класс Контроллер, добавив в него созданный сервис;
— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
 */

public class StudentGroupController {
    private StudentGroupService studentGroupService = new StudentGroupService();
    private StudentGroupView studentGroupView = new StudentGroupView();
    private StreamService streamService = new StreamService();

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }

    public void sortStreams() {
        List<Stream> streams = studentGroupService.getStreams();
        sortStreams(streams);
        studentGroupView.printStreams(streams);
    }
    public void printStreams(List<Stream> streams) {
        studentGroupView.printStreams(streams);
    }
}



