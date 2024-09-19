import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        //matrix[2][1]= 99;
        //matrix[0][0]= 321;
    //   RoutineMatrix.printMatrix(matrix);

        //RoutineMatrix.createMatrix();
        //RoutineMatrix.printMatrix(Matrix.inputMatrix());


        //RoutineMatrix.printMatrix(RoutineMatrix.sortRowsWithBubble((Matrix.inputMatrix())));

        int[][] test = Matrix.inputMatrix();
        RoutineMatrix.printMatrix(test);
        RoutineMatrix.searchInMatrix(test);
        ;;;
    }
}
