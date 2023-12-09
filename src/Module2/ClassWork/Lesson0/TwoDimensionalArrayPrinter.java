package Module2.ClassWork.Lesson0;

public class TwoDimensionalArrayPrinter {

    public void printInfo(TwoDimensionalArray twoDimensionalArray) { // references
        printArray(twoDimensionalArray);
        long sum = twoDimensionalArray.sum();
        double mean = twoDimensionalArray.arithmeticMean();
        System.out.printf("Sum of a array = %d%n", sum); // %n - new line
        System.out.printf("Arithmetic mean of array = %.3f", mean);
    }

    private void printArray(TwoDimensionalArray twoDimensionalArray) {
        for (int i = 0; i < twoDimensionalArray.array.length; i++) {
            for (int j = 0; j < twoDimensionalArray.array[i].length; j++) {
                System.out.printf("%-3d", twoDimensionalArray.array[i][j]);
            }
            System.out.println();
        }
    }
}
