package seminar2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
 */
public class Task5 {
    static Logger logger = Log.log(Task5.class.getName());
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getFileString(".")));
        write(".");

    }

    public static String[] getFileString(String path) {
        File dir1 = new File(path);
        if (dir1.isFile()){
            throw new RuntimeException("Это не папка");
        } else {
            return dir1.list();
        }
    }

    public static void write (String path) {
        try (FileWriter in = new FileWriter("task5.txt")) {
             String[] data = getFileString(path);
             for (String s: data){
                 in.append(s).append("\n");
                 in.flush();
             }
             throw new IOException();
        } catch (IOException e) {
//            System.out.println("Ошибка");
            logger.log(Level.INFO, "ошибка");
        }
    }
}
