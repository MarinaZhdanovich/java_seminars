package exceptions_seminar3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (CountTask2 count = new CountTask2(0)){
            count.add();
            count.add();
            count.add();
            count.add();
            System.out.println(count.getCounter());
            count.close();
            count.getCounter();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
