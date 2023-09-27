package seminar2;
/*
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Пример данных для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Пример:

{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами
 */
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        String newParams = PARAMS.replace("{", "")
                .replace("}", "")
                .replace("\"", "'");  //'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'

        String name = newParams.split(",")[0].split(":")[1]; //'Ivanov'
        String country = newParams.split(",")[1].split(":")[1];//'Russia'
        String city = newParams.split(",")[2].split(":")[1]; //'Moscow'
        String age = newParams.split(",")[3].split(":")[1]; // 'null'

        StringBuilder result = new StringBuilder(QUERY);
        // contains используется для проверки наличия элемента в коллекции или подстроки в строке list.contains("apple")
        // equals используется для сравнения двух объектов object1.equals(object2)

        if (!name.contains("'null'")) {
            result.append("name=").append(name);
        }
        if (!country.contains("'null'")) {
            result.append(" and ").append("country=").append(country);
        }
        if (!city.contains("'null'")) {
            result.append(" and ").append("city=").append(city);
        }
        if (!age.contains("'null'")) {
            result.append(" and ").append("age=").append(age);
        }
        return result;

    }
}
public class Task9 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}