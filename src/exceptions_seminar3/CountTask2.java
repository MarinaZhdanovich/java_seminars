package exceptions_seminar3;

import java.io.IOException;

/*
Создайте класс Счетчик, у которого есть метод add(), увеличивающий
значение внутреннейint переменнойна 1.Сделайте так, чтобы с объектом
такого типа можно было работать в блоке try-with-resources. Нужно бросить
исключение, еслиработа с объектом типа счетчикбылане в ресурсномtry
и/или ресурс остался открыт.Подумайте какой тип исключения подойдет
лучше всего.
 */
public class CountTask2 implements AutoCloseable{
    private Integer counter;

    public CountTask2(Integer counter) {
        this.counter = counter;
    }

    public void add() throws IOException {
        checkClose();
        counter++;
    }

    public Integer getCounter() throws IOException {
        checkClose();
        return counter;
    }


    public void checkClose() throws IOException {
        if (counter == null) {
            throw new IOException("Экземпляр закрыт");
        }
    }

    @Override
    public void close() {
        counter = null;
    }
}
