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
    public static void bubbleSort(int[][] mas) {


        for (int i = 0; i < mas.length-1; i++) {
            int end = mas.length - i;
            for (int j = 0; j < end-1; j++) {
                if (mas[j] > mas[j+1])
                    RoutineMatrix.swapTwoElements(mas, j, j+1);
            }
        }
    }
    public static void swapTwoElements(int[] mas, int i, int j){
        int tmp = mas[i];
        mas[i] = mas[j];
        mas[j] = tmp;
    }




}










