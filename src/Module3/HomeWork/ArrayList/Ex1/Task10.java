package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Task10 {
    // Напишите программу на Java для перетасовки элементов в списке массива.

    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(2.1);
        doubles.add(3.5);
        doubles.add(4.7);
        System.out.println(doubles);

        Collections.shuffle(doubles);
        System.out.println(doubles);

    }

}
