package task2.runner;


import task2.matrix.MatrixOne;
import task2.matrix.MatrixTwo;
import task2.matrixOperation.MatrixOperation;
import task2.utils.Utils;

public class Runner {

    public static void main(String[] args){
        Utils.utils(MatrixOperation.matrixOperation(MatrixOne.mat1(), MatrixTwo.mat2()));
    }
}
