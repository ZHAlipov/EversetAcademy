package Module2.ClassWork.Lesson0;

import java.util.Random;

public class TwoDimensionalArray {

    public int[][] array; // array -> reference, ссылка
    public int rows;
    public  int columns;

    public TwoDimensionalArray(int rows, int columns) { // parameters
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(10 - 5 + 1) + 5; // random.nextInt(high - low + 1) + low
            }
        }
    }

    public long sum() {
        long sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }

    public double arithmeticMean() {
        double mean = sum();
        mean = mean / (rows * columns);

        return mean;
    }
}