package exceptions_seminar2;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */
public class Main {
    public static void main(String[] args) {
        String patch = "C:\\Users\\User\\IdeaProjects\\Seminar\\src\\exceptions_seminar2\\names.txt";
        List<String[]> list = readFile(patch);
        modificationArray(list);
        writeFile(list, patch);
    }

    public static List<String[]> readFile (String patch) {
        List<String[]> listNames = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(patch));
            String line = " ";
            while ((line = reader.readLine()) != null) {
                listNames.add(line.split("="));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return listNames;
    }

    public static void modificationArray(List<String[]> arrayNames) {
        for (String[] itemArray : arrayNames) {
            if (!itemArray[1].equals("?") && !checkNumber(itemArray[1]))
                throw new IllegalArgumentException("Элемент не ? и не число");
            itemArray[1] = String.valueOf(itemArray[0].length());
        }
    }

    public static boolean checkNumber(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeFile(List<String[]>list, String patch) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(patch));
            for (String [] itemList : list) {
                writer.write(itemList[0] + "=" + itemList[1] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
