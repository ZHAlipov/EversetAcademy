package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task3 {
    //3. Напишите программу на Java для вставки элемента в список массивов в первую позицию.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0, 100);
        numbers.add(0, 56);
        numbers.add(0,99);
        numbers.add(3, 77);

        System.out.println(numbers);

    }


}
