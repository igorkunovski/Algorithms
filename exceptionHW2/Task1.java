
/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите дробное число");
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println(sc.nextFloat());
                break;
            } catch (InputMismatchException e) {
                System.out.println("Неправильный тип данных");
            }
        }
    }
}
