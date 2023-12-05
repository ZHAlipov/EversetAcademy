package Module1.basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        //arrayList();
        linkedList();
    }

    static void arrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        //System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        numbers.remove(1);
        //numbers.clear();

        for (Integer el: numbers) {
            System.out.println(el);
        }
    }

    public static void linkedList() {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.6f);
        numbers.add(3.1f);
        numbers.add(5.35f);

        for (Float el : numbers)
            System.out.println(el);
    }
}
