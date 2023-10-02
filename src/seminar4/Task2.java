package seminar4;
/*
^Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text:num
Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
Если введено print:nu
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
        import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        while (true) { //программа будет выполняться бесконечно, пока не будет прервана пользователем.
            System.out.println("Enter data: ");
            String in = prompt();
            String[] arr = in.split(":"); //[Marina, 3]
            String name = arr[0];
            int index = Integer.parseInt(arr[1]); //преобразует строку в число
            if (!name.equals("print")) {
                if(list.size()<index){ //размер списка меньше индекса
                    for (int i = 0; i <= index; i++) { //добавляем в список нулевые значения, чтобы можно было добавить элемент по указанному индексу
                        list.add(null);
                    }
                }
                list.add(index, name); //позиция, на которую хотим добавить строку
            } else {
                System.out.println(list.get(index));
            }
        }
    }

    public static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
