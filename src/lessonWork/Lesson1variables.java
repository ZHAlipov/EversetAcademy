package lessonWork;

public class Lesson1variables {

    public static void main(String[] args) {
        arithmeticOperators();

//        byte d = 23;
//        short s = 23;
//        int a = 1;
//        long l = 213;
//        long l2 = -123;
//
//        float b = 2.3f;
//        double c = 3.3;
//
//        char x = ';';
//
//        boolean t = true;

        int i = 1;
        long l = 70000;
        char c = 'c';
        boolean t = true;
        double d = 346;

//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(c);
//        System.out.println(t);
    }


    private static void assign() {
        String one = "one";
        one += "two";
        one = one + "three";
        one += "three ";
        one += "4 ";
        one += "5 ";
        System.out.println(one);

    }

    private static void stringType() {
        String str = "Helllo World!!!";
        System.out.println(str);
    }

    private static void stringUntil101() {
        String count = "";
        for (int i = 0; i < 101; i++) {
            count += i  + " ";
        }
        System.out.println(count);
    }

    private static void  arithmeticOperators() {
        int a = 34;
        int b = 20;
        int sum = a + b;
        int mul = a * b;
        int subs = a - b;
        int div = a / b;
        int mod = a % b;
        System.out.println("sum" + sum);
        System.out.println("mul" + mul);
        System.out.println("subs" + subs);
        System.out.println("div" + div);
        System.out.println("mod" + mod);

    }

}