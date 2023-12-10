package exceptions_seminar3;

import java.io.FileNotFoundException;

/*
Создайтеклассисключения, котороебудет возникатьпри попытке открыть
несуществующий файл. Исключение должно отображать понятное для
пользователясообщение об ошибке.
 */

public class NotFile extends FileNotFoundException {

    public NotFile(String path) {
        super("Открыть несуществующий файл нельзя, ваш путь у файлу ->" + path);
    }
    public NotFile() {
        super("Открыть несуществующий файл нельзя");
    }
}
