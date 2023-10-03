package seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО, возраст, пол(м/ж) (через запятую): ");
        System.out.println("Выход из режима ввода exit");
        while (true) {
            String sTmp = scanner.nextLine();
            if (sTmp.equalsIgnoreCase("exit")) break;
            list.add(sTmp);
        }
        list.forEach(n ->{
            String[] str = n.split(", ");
            String[] str1 = str[0].split(" ");
            System.out.printf("%s %s. %s. \n", str1[0], str1[1].charAt(0), str1[2].charAt(0));
        });
        System.out.println("-".repeat(30));
        list.sort((n1, n2) ->{
            int a = Integer.parseInt(n1.split(", ")[1]);
            int b = Integer.parseInt(n2.split(", ")[1]);
            return a - b;
        });
        list.forEach(n ->{
            String[] str = n.split(", ");
            String[] str1 = str[0].split(" ");
            System.out.printf("%s %s. %s. %s\n", str1[0], str1[1].charAt(0), str1[2].charAt(0), str[1]);
        });
        System.out.println("-".repeat(30));
        ArrayList<String> list2 = new ArrayList<>(list);
        list2.removeIf(n-> n.split(", ")[2].toLowerCase().charAt(0)=='м');
        list.removeAll(list2);
        list2.addAll(list);
        list2.forEach(n ->{
            String[] str = n.split(", ");
            String[] str1 = str[0].split(" ");
            System.out.printf("%s %s. %s. %s %s\n", str1[0], str1[1].charAt(0), str1[2].charAt(0), str[1], str[2]);
        });

    }
}
