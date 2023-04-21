/*
Если необходимо, исправьте данный код (задание 2)
 */

public class Task2 {

    public static void main(String[] args){

        try {
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7};
//            int[] intArray = null;
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
