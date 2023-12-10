package exceptions_seminar3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        try (CountTask2 count = new CountTask2(0)){
//            count.add();
//            count.add();
//            count.add();
//            count.add();
//            System.out.println(count.getCounter());
//            count.close();
//            count.getCounter();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            System.out.println(div(10, 5));
            System.out.println(div(6, 5));
            System.out.println(div(3, 0));
        } catch (DivByZero e) {
            System.out.println(e.getMessage());
        }
    }


    public static double div(int a, int b){
        if (b == 0)
            throw new DivByZero();
        return (double) a / b;
    }
}
