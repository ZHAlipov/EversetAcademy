package homeWork;
import org.jetbrains.annotations.NotNull;

public class HomeWork7 {

    public static void main(String[] args) {
        int[] array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2};
        //task4
        printArray(array);
        selectionSort(array);
        printArray(array);
        //task5
//        printArray(array);
//        Arrays.sort(array);
//        descendingSort(array);
//        printArray(array);
    }


    public static void printArray(int[] array) {
        // Вывод отсортированного массива
        System.out.print("Массив = {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
//    **Write a program to Sort Numeric Array In Descending Order**
//            ***Sample Output***
//    Array = {23, 5, 67, 20, 3, 30, 79, 3, 70, 2}
//    Descending Order = {79, 70, 67, 30, 23, 20, 5, 3, 3, 2}
    public static void  selectionSort(int @NotNull [] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j]<min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp =array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }

    public static void descendingSort(int @NotNull [] array) {
        // Разворот порядка элементов массива для получения убывающего порядка
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

}
