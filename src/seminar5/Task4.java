package seminar5;
/*
Напишите программу, представляющую телефонную книгу. Программа должна иметь следующие функции:

add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.

find(String name): Поиск номеров телефона по имени в телефонной книге.
Если запись с именем name существует, возвращает список номеров телефона для этой записи.
Если запись с именем name не существует, возвращает пустой список.

getPhoneBook(): Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.

На входе:


'Alice'
'Bob'
'123456'
'789012'
На выходе:


[123456, 789012]
{Bob=[789012], Alice=[123456, 789012]}
[]
 */
import java.util.ArrayList;
import java.util.HashMap;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {//Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
            ArrayList<Integer> phoneNumbers = phoneBook.get(name); // получаем по ключу name список номеров телефонов
            phoneNumbers.add(phoneNum); // добавляем в список телефон
        } else {  //Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
            ArrayList<Integer> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNum); // добавляем номер в список
            phoneBook.put(name, phoneNumbers); //помещаем список в телефонную книгу,
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) { // Если запись с именем name существует, возвращает список номеров телефона для этой записи.
            return phoneBook.get(name); // получаем по ключу name список номеров телефонов
        } else {
            return new ArrayList<>(); //Если запись с именем name не существует, возвращает пустой список.
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook; //Возвращает всю телефонную книгу в виде HashMap, где ключи - это имена, а значения - списки номеров телефона.
    }
}


//class PhoneBook {
//    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
//
//    public void add(String name, Integer phoneNum) {
//        if (phoneBook.containsKey(name)) {
//            phoneBook.get(name).add(phoneNum);
//        } else {
//            ArrayList<Integer> values = new ArrayList<>();
//            values.add(phoneNum);
//            phoneBook.put(name, values);
//        }
//    }
//
//    public ArrayList<Integer> find(String name) {
//        if (phoneBook.containsKey(name)) {
//            return phoneBook.get(name);
//        }
//        return new ArrayList<Integer>();
//    }
//
//    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
//        return phoneBook;
//    }
//}

public class Task4 {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);

        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}
