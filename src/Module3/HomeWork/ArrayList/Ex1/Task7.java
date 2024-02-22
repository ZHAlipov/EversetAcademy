package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task7 {
    //Напишите программу на Java для поиска элемента в списке массива. Список целых чисел.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        System.out.println(numbers);

        for(Integer el: numbers) {
            if (el == 5) {
                System.out.println("Элемент со значением 5 найден по индексу: " + el);
            }
        }

    }
}
