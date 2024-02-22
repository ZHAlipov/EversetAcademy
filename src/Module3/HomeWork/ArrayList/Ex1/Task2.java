package Module3.HomeWork.ArrayList.Ex1;

import java.util.ArrayList;

public class Task2 {

    //2. Написать Java-программу для итерационного перебора всех элементов списка.

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("Black");
        color.add("White");


        for(String el : color) {
            System.out.println(el);
        }
    }

}
