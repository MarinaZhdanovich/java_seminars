package seminar3;
/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
public class Task1 {
    public static void main(String[] args) {
        isEqual(s1, s6);
    }

    Object object = new Object();
    static String s1 = "hello";
    static String s2 = "hello"; // оптимизация java
    static String s3 = s1;
    static String s4 = "h" + "e" + "l" + "l" + "o"; //"hello
    static String s5 = new String("hello"); // new - новая ссылка
    static String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    public static void isEqual(String args0, String args1) {
//        s1 = s1 + "hbhbbbjuhfd";
        if (args0 == args1) {
            System.out.println("Равны как ссылки");
        } else if (args0 != args1) {
            System.out.println("Не равны как ссылки");
        }
        if (args0.equals(args1)) {
            System.out.println("Равны как значения");
        } else if (!args0.equals(args1)) {
            System.out.println("Не равны как значения");
        }
    }
}

