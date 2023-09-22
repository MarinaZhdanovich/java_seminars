package seminar1;
/*
Создать строку с текстом. Вывести только четные символы
 */
public class Task4 {
    public static void main(String[] args) {
        String name = "Hello world";
        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0) System.out.print(name.charAt(i));
        }
    }
}

