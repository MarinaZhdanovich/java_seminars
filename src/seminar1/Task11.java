package seminar1;
/*
Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.
 */


public class Task11 {
        public static void main(String[] args) {

            Answers ans = new Answers();
            ans.printPrimeNums();
        }
    }

class Answers {
    public void printPrimeNums() {
        boolean isPrime;
        for (int i = 2; i < 1000; i++) {   // i текущее число
            isPrime = true;
            for (int j = 2; j < i; j++) { // j делители для числа i (15/2, 15/3 break)
                if (i % j == 0) {
                    isPrime = false; // если текущее число не поделилось без остатка на делители, то простое
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }
}