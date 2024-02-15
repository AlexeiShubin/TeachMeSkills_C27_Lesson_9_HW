package task2.utils;

/**
 * class with methods utils, which displays the matrix on the screen
 */

public class Utils {
    public static void utils(byte[][] matrix){
        for (byte[] bytes : matrix) {
            for (byte j = 0; j < matrix[0].length; j++) {
                System.out.print(bytes[j] + " ");
            }
            System.out.println();
        }
    }
}
