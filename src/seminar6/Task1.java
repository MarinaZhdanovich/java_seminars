package seminar6;

import java.util.*;

/*

 */
public class Task1 {
    public static void main(String[] args) {
        HashSet<Integer> data = new HashSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(data);
        LinkedHashSet<Integer> data2 = new LinkedHashSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(data2);
        TreeSet<Integer> data3 = new TreeSet<>(List.of(4, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(data3);
    }
}
