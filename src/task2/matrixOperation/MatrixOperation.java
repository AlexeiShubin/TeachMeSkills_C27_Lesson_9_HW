package task2.matrixOperation;

/**
 * class with method "matrixOperation", which multiplies matrices
 */

public class MatrixOperation {
    public static byte[][] matrixOperation(byte[][] matrix1, byte[][] matrix2){
        byte[][]resultMatrix=new byte[matrix1.length][matrix2[0].length];
        for(byte i=0; i< resultMatrix.length; i++){
            for (byte j=0; j< resultMatrix[0].length; j++){
                for(byte k=0; k<matrix1[0].length; k++){
                    resultMatrix[i][j]+= (byte) (matrix1[i][k]*matrix2[k][j]);
                }
            }
        }
        return resultMatrix;
    }
}
