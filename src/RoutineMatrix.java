import java.util.Scanner;
import java.util.Random;
public class RoutineMatrix {



    // вывод матрицы на экран
    public static void printMatrix (int[][] m){

        for (int i = 0; i < m.length; i++) {                // цикл по строкам матрицы
            //System.out.println("строка матрицы " + i + ": " + Arrays.toString(m[i]));
            for (int j = 0; j < m[i].length; j++) {         // цикл по ячейкам строки в матрице
                System.out.printf("%3d" , m[i][j]);
            }
            System.out.println();
        }
    }

    // Алгоритм сортировки пузырьком
    public static int[][] sortRowsWithBubble(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            bubbleSort(matrix[i]);
        }

        return matrix;
    }

    private static void bubbleSort(int[] arr) {
        int end = arr.length;
        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static boolean searchInMatrix (int[][] m){
        System.out.println("  ");
        System.out.printf("введите искомое числов матрице:: ");
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        for (int i = 0; i < m.length; i++) {                // цикл по строкам матрицы
            for (int j = 0; j < m[i].length; j++) {         // цикл по ячейкам строки в матрице
                if (m[i][j]==search){
                    System.out.printf("Число %d найдено под координатами [%d][%d]\n", search, i, j);
                    found = true;}
            }
        }
        System.out.println();
        if (!found) {
            System.out.printf("Число %d не найдено в матрице\n", search);
        }
        return found;
    }

    public static int[][] transportMatrix(int [][] matrix) {

        int rows = matrix.length;
        int column = matrix[0].length;
        int[][] transMatrix = new int [column][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println();
        printMatrix(transMatrix);
        return transMatrix;
    }

    public static int sumAllElem (int[][] m){
        int sumEl = 0;

        for (int [] row : m) {                // цикл по строкам матрицы
            //System.out.println("строка матрицы " + i + ": " + Arrays.toString(m[i]));
            for (int j : row) {         // цикл по ячейкам строки в матрице
                sumEl +=j;
            }
        }
        System.out.println();
        System.out.println("сумма элементов в матрице:: " + sumEl);
        return sumEl;
    }

    public static int indexOfMax(int[][] m){
        int n = m[0][0];
        int end = m[0].length;
        int numberOfMaximum = 0;
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j<end; j++){
            if(n < m[i][j])
            {
                n = m[i][j];
                numberOfMaximum = i;}
            }
        }
        System.out.println();
        System.out.println("макс эл в матрице на строке:: " + numberOfMaximum);
        return numberOfMaximum;
    }
}










