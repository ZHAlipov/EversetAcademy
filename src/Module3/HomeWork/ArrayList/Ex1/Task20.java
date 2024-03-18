package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task20 {
    //20. Написать Java-программу для увеличения размера списка массива.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(20);

        numbers.ensureCapacity(33);
    }
}
