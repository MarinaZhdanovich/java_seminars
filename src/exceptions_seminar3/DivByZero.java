package exceptions_seminar3;
/*
1. Создайтеклассисключения, который будет выбрасываться при делении на
0. Исключениедолжно отображать понятноедля пользователя сообщение
об ошибке.

 */
public class DivByZero extends ArithmeticException {

    public DivByZero() {
        super("Деление на 0 запрещено");
    }
}
