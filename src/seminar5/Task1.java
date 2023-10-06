package seminar5;
/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */

import java.util.HashMap;
import java.util.Map.Entry;
public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> phonebook = new HashMap<>();
        phonebook.put(123456, "Иванов");
        phonebook.put(321456, "Васильев");
        phonebook.put(234561, "Петрова");
        phonebook.put(234432, "Иванов");
        phonebook.put(654321, "Петрова");
        phonebook.put(345678, "Иванов");
        for (Entry line: phonebook.entrySet()) { //Entry класс, предоставляющий доступ к ключу и значению каждой записи в хеш-карте
            if(line.getValue().equals("Иванов")){ //Метод entrySet() возвращает множество (set) объектов типа Entry, где каждый Entry представляет пару "ключ-значение" из хеш-карты.
                System.out.println(line.getKey() + "=" + line.getValue());
            }
        }
    }
}