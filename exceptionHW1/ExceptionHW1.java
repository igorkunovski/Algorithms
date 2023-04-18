import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.abs;

/*
    1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
        Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

     2.   Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
        не равны, необходимо как-то оповестить пользователя.

     3.   * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не
        равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
        пользователь может увидеть - RuntimeException, т.е. ваше.
*/
public class ExceptionHW1 {
    public static void main(String[] args) {
//        System.out.println(arithmExcept());
//        nullPointExcept();
//        System.out.println(arrIndExc());


        System.out.println(Arrays.toString(difference(new int[]{2, 2, 2}, new int[]{3, 3, 3})));
        System.out.println(Arrays.toString(difference(new int[]{2, 2, 2}, new int[]{3, 3})));
        System.out.println(Arrays.toString(difference2(new int[]{2, 2, 2}, new int[]{3, 3})));

    }

    // ArithmeticException: / by zero
    private static int arithmExcept(){
        return 7/0;
    }

    // NullPointerException
    private static void nullPointExcept(){
        ArrayList<String> arr = null;
        arr.add("NPException");
    }

    // ArrayIndexOutOfBoundsException
    private static String arrIndExc(){
        String [] names = new String[]{"Alfa", "Bravo", "Charlie"};
        return names[4];
    }

    private static int[] difference(int[] arr1, int [] arr2) {

        int[] result;

        try {
            if (arr1.length != arr2.length) {
                throw new RuntimeException();
            } else {
                result = new int[arr1.length];
                for (int i = 0; i < arr1.length; i++) {
                    result[i] = abs(arr1[1] - arr2[i]);
                }
            }
            return result;
        }catch (RuntimeException e){
            System.out.println("arrays have different lengths");

        }
        return null;
    }


    private static int[] difference2(int[] arr1, int [] arr2) {

        int[] result;

        if (arr1.length != arr2.length) {
            throw new RuntimeException("arrays have different lengths");
        } else {
            result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = abs(arr1[1] - arr2[i]);
            }
        }
        return result;
    }
}
