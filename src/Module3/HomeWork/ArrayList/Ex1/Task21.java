package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task21 {
    //Напишите программу на Java для замены второго элемента ArrayList указанным элементом.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);
        numbers.set(1, 5);
        System.out.println(numbers);
    }

}
