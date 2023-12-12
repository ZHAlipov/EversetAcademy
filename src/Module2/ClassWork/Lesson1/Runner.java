package Module2.ClassWork.Lesson1;

import java.util.Arrays;

public class Runner {


    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(1, 2); // 1 + 2i
        ComplexNumber complexNumber2 = new ComplexNumber(3, 5); // 1 + 2i

        complexNumber1.sum(complexNumber2);
        System.out.println("After sum: " + complexNumber1);

        complexNumber2.sum(complexNumber1);
        System.out.println("After sum: " + complexNumber2);

        ComplexNumber complexNumber3 = new ComplexNumber(2, 2);
        complexNumber2.subtract(complexNumber3);

        System.out.println("After subtraction: " + complexNumber2);

        ComplexNumber complexNumber4 = new ComplexNumber(2, 2);
        ComplexNumber complexNumber5 = complexNumber3;
        System.out.println(complexNumber4.equals(complexNumber3));
        System.out.println(complexNumber4 == complexNumber3);
        System.out.println(complexNumber5 == complexNumber3);
    }

    private static void objSample() {
        // class_name ref_name = new class_constructor(...);
        ConstructorClass obj1 = new ConstructorClass("Object 1"); // instance of class = экземпляр -> объект, object
        ConstructorClass obj2 = new ConstructorClass("Object 2");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        obj1.printPrettyName();
        obj2.printPrettyName();
    }

    public static void equalsSample() {
        String str1 = "String 1";
        String str2 = "String 1";

        if (str1 == str2) { // object1 == object2 -> compare references
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }

        if (str1.equals(str2)) { // object1.equals(object2) -> compare object data
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        System.out.printf("HashCode str1: %s%n", str1.hashCode());
        System.out.printf("HashCode str2: %s%n", str2.hashCode());
        // null - neil, <null> - признак отсутствия - пустота, ничего - void
    }

    public static void referencesSample() {
    /*
        Primitives: boolean, int, double, ...
        Reference: Objects, of any class type, like String
          any arrays
     */
        int[] a = new int[]{0, -20};
        int s = 23;
        System.out.println(Arrays.toString(a));
        method1(a);
        System.out.println(Arrays.toString(a));
        method2(a);
        System.out.println(Arrays.toString(a));
        method3(a);
        System.out.println(Arrays.toString(a));

        method4(s);
        System.out.println(s);
        method5(s);
        System.out.println(s);
    }

    private static void method1(int[] arr) { // 0xd123AB2
        arr[0] = 1;
    }

    private static void method2(int[] arr) { // 0xd123AB2
        arr[1] = 2;
    }

    private static void method3(int[] arr) { // 0xd123AB2
        arr[0] = 3;
    }

    private static void method4(int x) { // x = s
        x = 5;
    }

    private static void method5(int y) { // y = s
        y = 25;
    }
}