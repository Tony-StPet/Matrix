import java.util.Random;
import java.util.Scanner;

public class Matrix {

    public int[][] matrix;
    public int rows;
    public int column;

    public Matrix(int rows, int column) {
        this.rows = rows;
        this.column = column;
    }

    public static int[][] inputMatrix() {
        System.out.println("введите массив размером:: rows + column");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] mas = new int[rows][column];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < column; j++) {

                mas[i][j] = random.nextInt(100); // генерируем случайное число от 0 до 99
            }

        }
        System.out.println();
        return mas;
    }

}