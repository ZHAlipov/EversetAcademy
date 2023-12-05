package Module1.basics;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        OneDimensionalArrays();
        multArrays();
    }

    static void OneDimensionalArrays() {
        //Одномерные массивы
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        int res = nums[2] + nums[1];
        System.out.println(res + "\n");

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
        System.out.println(nums2[1] + "\n");

        int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimal: " + min);
    }

    static void multArrays() {
        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {3, 4},
                {6, 1}
        };

        //nums[1][1] = 67;
        System.out.println(nums[2][1]);


    }
}
