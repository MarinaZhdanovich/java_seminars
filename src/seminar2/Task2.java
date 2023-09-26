package seminar2;
/*
Напишите метод, который сжимает строку.
Пример: aaaabbbcdd → a4b3cd2
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println(reduceStr("aaaabbbcdd"));
    }
    public static String reduceStr(String str) {
        int count = 1;
        String[] arr = str.split("");
        StringBuilder result = new StringBuilder(); // создаем объект для построения строки
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {  // первый символ в строке вставляем без изменений
                result.append(arr[i]);
                continue;
            }

            if (arr[i].equals(arr[i - 1])) {   // equals - сравнивает содержимое символов
                count++;
            } else if (!(arr[i].equals(arr[i - 1])) && count != 1) {  //!  - значит не равны символы
                result.append(count).append(arr[i]);
                count = 1; // счетчик сбрасываем
            } else {
                result.append(arr[i]);  // текущий отличается от предыдущего символа и count = 1
            }
        }
        if (count != 1) {
            result.append(count); // проверяем последний символ строки
        }
        return result.toString();
    }
}

