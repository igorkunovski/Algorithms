/*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args){

        System.out.println("Введите сообщение");
        Scanner sc = new Scanner(System.in);

        String insert = sc.nextLine();
        if (insert.equals("")){
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("пустая строка, выходим из программы");;
            }
        } else {
            System.out.println(insert);
        }
    }
}
