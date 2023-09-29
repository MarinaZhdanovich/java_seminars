package seminar3;
/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List example = new ArrayList<String>();
        example.add("ggydseehj");
        example.add(1);
        System.out.println(example);

        for (int i = 0; i < example.size(); i++) {
            if (example.get(i) instanceof Integer) {
                example.remove(example.get(i));
                i--;
            }
        }
        System.out.println(example);
    }
}
