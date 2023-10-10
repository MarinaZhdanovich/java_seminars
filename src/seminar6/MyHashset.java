package seminar6;

import java.util.HashMap;

/*
Разработать класс, исполняющий функционал класса HashSet без использования сетов вообще. Храним целые числа.
Реализовать метод добавления элемента учитывающий особенности множеств. Сигнатура метода public boolean add(Integer i)
Реализовать метод удаления элемента учитывающий особенности множеств. Сигнатура метода boolean remove(Object o)
Реализовать метод удаления всех элементов множества. Сигнатура метода void clear()
 */
public class MyHashset {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        System.out.println(mySet.add(1));
        System.out.println(mySet.add(1));
        mySet.remove(1);
        mySet.remove(1);
        mySet.add(1);
        mySet.add(5);
        mySet.add(6);
        mySet.add(9);
        mySet.add(1);
        mySet.clear();
        System.out.println(mySet.remove(5));
    }
}
class MySet {

    private HashMap<Integer, Object> map = new HashMap<>();
    private static final Object PRESENT = new Object();

    public boolean add(Integer i) {
        return map.put(i, PRESENT) == null;
    }


    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    public void clear() {
        map.clear();
    }
}
