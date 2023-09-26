package seminar2;
/*
Объявить строку с текстом, подсчитать количество запятых
 */
public class Task6 {
    public static void main(String[] args) {
        String str = "Считаем, количество запятых, чтобы посчитать, запятые";
        int count = 0;
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == ','){
                count++;
            }
        }
        System.out.println(count);

    }
}
