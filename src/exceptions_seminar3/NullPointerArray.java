package exceptions_seminar3;
/*
Создайтеклассисключений, котороебудет возникатьпри обращении к
пустому элементув массиве ссылочного типа. Исключениедолжно
отображать понятноедля пользователя сообщениеоб ошибке
 */
public class NullPointerArray extends NullPointerException{

    public NullPointerArray(int index) {
        super("Обращение к пустому элементу в массиве запрещено, индекс элемента: " + index);
    }

    public NullPointerArray(){
        super("Обращение к пустому элементу в массиве запрещено");
    }
}
