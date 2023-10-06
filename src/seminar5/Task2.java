package seminar5;
/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true

 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String s = "foo", t = "bar";
        String s1 = "paper", t1 = "title";
        System.out.println(searchLitter(s, t));
        System.out.println(searchLitter(s1, t1));
    }
    public static boolean searchLitter(String str, String str2){
        if(str.length() != str2.length()) {
            return false;
        }
        char[] strArr = str.toCharArray(); //[f, o, o]
        char[] strArr2 = str2.toCharArray(); //[p, a, p, e, r]

        Map<Character, Character> result = new HashMap<>();
        for (int i = 0; i < strArr.length ; i++) {
            if(result.get(strArr[i]) != null){ //на первой итерации strArr[i] равен 'f'. result пустой, для этого символа нет соответствия, и он добавляется в карту result с соответствующим символом из str2. Теперь result содержит пару ('f', 'b').
                if(!result.get(strArr[i]).equals(strArr2[i])){
                    return false;
                }

            }else {
                result.put(strArr[i], strArr2[i]);
            }
        }
        return true;
    }
}