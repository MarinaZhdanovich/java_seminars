package exceptions_seminar3;

import java.io.IOException;

/*
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самогометода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвалметод doSomething().
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void doSomething() throws IOException {
    }
}
