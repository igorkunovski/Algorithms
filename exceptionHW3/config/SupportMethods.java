package config;

import exception.BirthDateException;
import exception.DigitInStringException;
import exception.EmptyNameException;
import exception.GenderException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SupportMethods {

    public int chooseNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Incorrect input, try again");
        }
        return chooseNumber();
    }

    public String getString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void checkForEmpty(String str){
        if (str.isEmpty()){
            throw new EmptyNameException();
        }
    }

    public void checkForDigits(String str) throws DigitInStringException {
        for (char ch : str.toCharArray()) {
            if (!Character.isLetter(ch)) {
                throw new DigitInStringException();
            }
        }
    }

    public char getChar() throws GenderException {
        String res = getString().trim();
        if (res.equalsIgnoreCase("f")) return 'f';
        else if (res.equalsIgnoreCase("m")) return 'm';
        throw new GenderException();
    }

    public String birth() throws BirthDateException {
        String res = getString().trim();
        StringBuilder result = new StringBuilder();

        try {

            if (res.length() == 10) {
                String[] resArr = res.split("\\.");

                if ((resArr.length == 3
                        && resArr[0].length() == 2)
                        && resArr[1].length() == 2
                        && resArr[2].length() == 4) {

                    int date = Integer.parseInt(resArr[0]);
                    int month = Integer.parseInt(resArr[1]);

                    if ((date >= 1 && date <= 31) && (month >=1 && month <= 12)) {

                        // тут, конечно, еще много проверок нужно, как например 30.02 или 31.04, выборка годов и тд.

                        result.append(date).append(".");
                        result.append(month).append(".");
                        result.append(Integer.parseInt(resArr[2]));

                        // Если день/месяц содержат 0 спереди (01.10, 11.03 и тд), то запишется в файл без ноля(1.10, 11.3).
                        // Чтобы сохранить ноль, нужно сделать дополнительную обработку перед append.

                        return String.valueOf(result);
                    }
                }
            }
        } catch (RuntimeException ignored) {
            // все проблемы обработки строки при некорректном вводе будут отловлены тут
            // и далее пробросится своё исключение
        }
        throw new BirthDateException();
    }
}
