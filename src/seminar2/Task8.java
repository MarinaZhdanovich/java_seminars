package seminar2;
/*
Заполнить строку и StringBuilder 1000ю символами. Сравнить время заполнения
 */

public class Task8 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += Character.getName(i); // символы с шестнадцатеричными кодами 0, 1, 2, 3 итд.
                                        //str = "\\u0000\\u0001\\u0002\\u0003..."
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append(Character.getName(i));
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }
}
