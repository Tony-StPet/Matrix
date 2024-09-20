//В рождественский вечер на окошке стояло три цветочка, слева направо: герань, крокус и фиалка.
//Каждое утро Маша вытирала окошко и меняла местами стоящий справа цветок с центральным цветком.
//А Таня каждый вечер поливала цветочки и меняла местами левый и центральный цветок.
//Требуется определить порядок цветов ночью по прошествии K дней.
//        Входные данные
//Во входном файле INPUT.TXT содержится натуральное число K – число дней (K ≤ 1000).
//
//Выходные данные
//В выходной файл OUTPUT.TXT требуется вывести три английских буквы: «G», «C» и «V» (заглавные буквы без пробелов),
//описывающие порядок цветов на окошке по истечении K дней (слева направо).
//Обозначения: G – герань, C – крокус, V – фиалка.
import java.util.Scanner;
public class Flowers {

    public static void chengeArray() {

        char[] flower = new char[]{'G', 'C', 'V'};

        System.out.println("введите количество дней: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        for (int k = 0; k < day; k++) {

            swapTwoElements(flower, flower[2], flower[1]);
            swapTwoElements(flower, flower[0], flower[1]);
        }


    }

    public static void swapTwoElements(char[] mas, char i, char j) {
        char tmp = mas[i];
        mas[i] = mas[j];
        mas[j] = tmp;
    }

    public static void printArray(char[] mas)    {
        System.out.print("массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(" "+mas[i]);
        }
        System.out.println();
    }

}