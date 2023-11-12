package homeWork;

import java.util.Scanner;

public class Homework2 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task24();
    }

    public static void  task1() {
        System.out.println("Enter a value a:");
        int a = scanner.nextInt();
        System.out.println("Enter a value b:");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.println("a > b");
        } else if ( a < b ) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void  task2() {
        System.out.println("Enter a value a:");
        int a = scanner.nextInt();
        System.out.println("Enter a value b:");
        int b = scanner.nextInt();
        System.out.println("Enter a value c:");
        int c = scanner.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("a is the maximum value between others");
        } else if ((b >= a) && (b >= c)) {
            System.out.println("b is the maximum value between others");
        } else {
            System.out.println("c is the maximum value between others");
        }
    }

    public static void task3() {
        System.out.println("Enter a value:");
        int a = scanner.nextInt();

        if (a > 0) {
            System.out.println("a is positive number");
        } else if (a < 0) {
            System.out.println("a is negative number");
        } else {
            System.out.println("a is zero");
        }
    }

    public static void task4() {
        System.out.println("Enter a number value:");
        int a = scanner.nextInt();

        if ((a % 5 == 0)  && (a % 11 == 0)) {
            System.out.println("This number divisibled by 5 and 11");
        } else {
            System.out.println("This number not divisibled by 5 and 11");
        }
    }

    public static void task5() {
        System.out.println("Введите числовое значение:");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

    public static void  task6() {
        System.out.println("Введите год");
        int a = scanner.nextInt();

        if (a % 400 == 0) {
            System.out.println(a + "является високосным годом");
        } else if (a % 100 == 0) {
            System.out.println(a + "не является високосным годом");
        } else if (a % 4 == 0) {
            System.out.println(a + "является високосным годом");
        } else {
            System.out.println(a + "не является високосным годом");
        }
    }

    public static void  task7() {
        System.out.println("Введите символ");
        char c = scanner.next().charAt(0);


        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            System.out.println(c + " символ есть в алфавите");
        } else {
            System.out.println(c + " символ отсутствует в афавите");
        }
    }

    public static void task8() {
        System.out.println("Введите символ");
        char ch = scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " является гласным");
        } else {
            System.out.println(ch + " является согласным");
        }
    }

    public static void  task9() {
        System.out.println("Введите символ");
        char ch = scanner.next().charAt(0);
        char lowerCase = Character.toLowerCase(ch);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is A ALPHABET.");
        } else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is A DIGIT.");
        } else {
            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }

    public static void task10() {
        System.out.print("Enter the Character :");
        char ch = scanner.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("This is a Lowercase Alphabet");
        }
        else
        {
            System.out.println("This is a Uppercase Alphabet");
        }
    }

    public static void task11() {

        System.out.println("Enter weekday day number (1-7) : ");
        int weekday = scanner.nextInt();
        if(weekday == 1) {
            System.out.println("Monday");
        } else if(weekday == 2) {
            System.out.println("Tuesday");
        } else if(weekday == 3) {
            System.out.println("Wednesday");
        } else if(weekday == 4) {
            System.out.println("Thursday");
        } else if(weekday == 5) {
            System.out.println("Friday");
        } else if(weekday == 6) {
            System.out.println("Saturday");
        } else if(weekday == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter weekday number between 1-7.");
        }
    }

    public static void task12() {
        System.out.print("Enter the Month Number(1-12) :");
        int num = scanner.nextInt();
        if(num==1)
            System.out.println("This is a January");
        else if(num==2)
            System.out.println("This is a February");
        else if(num==3)
            System.out.println("This is a March");
        else if(num==4)
            System.out.println("This is a April");
        else if(num==5)
            System.out.println("This is a May");
        else if(num==6)
            System.out.println("This is a June");
        else if(num==7)
            System.out.println("This is a July");
        else if(num==8)
            System.out.println("This is a August");
        else if(num==9)
            System.out.println("This is a September");
        else if(num==10)
            System.out.println("This is a October");
        else if(num==11)
            System.out.println("This is a November");
        else if(num==12)
            System.out.println("This is a December");
        else
            System.out.println("Enter 1 to 12...");
    }

    public static void task13() {
        System.out.println("Enter the Amount :");
        int amt = scanner.nextInt();
        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
        if(amt >= 500)
            n500 = amt/500;
        amt -= n500 * 500;
        if(amt >= 100)
            n100 = amt/100;
        amt -= n100 * 100;
        if(amt >= 50)
            n50 = amt/50;
        amt -= n50 * 50;
        if(amt >= 20)
            n20 = amt/20;
        amt -= n20 * 20;
        if(amt >= 10)
            n10 = amt/10;
        amt -= n10 * 10;
        if(amt >= 5)
            n5 = amt/5;
        amt -= n5 * 5;
        if(amt >= 2)
            n2 = amt /2;
        amt -= n2 * 2;
        if(amt >= 1)
            n1 = amt;

        System.out.println("Total Number of Notes");
        System.out.println("500 = "+ n500);
        System.out.println("100 = "+ n100);
        System.out.println("50 = "+ n50);
        System.out.println("20 = "+ n20);
        System.out.println("10 = "+ n10);
        System.out.println("5 = "+ n5);
        System.out.println("2 = "+ n2);
        System.out.println("1 = "+ n1);
    }

    public static void task14() {
        System.out.println("Enter Three Angles of Triangle :");
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();
        int sum = angle1 + angle2 + angle3;
        if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
        {
            System.out.println("Triangle is valid");
        }
        else
        {
            System.out.println("Triangle is not valid");
        }
    }

    public static void task15() {
        System.out.println("Enter Three Sides of Triangle :");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if((side1 + side2) > side3)
            if((side2 + side3) > side1)
                if((side1 + side3) > side2)
                    System.out.println("Triangle is valid.");
                else
                    System.out.println("Triangle is not valid.");
            else
                System.out.println("Triangle is not valid.");
        else
            System.out.println("Triangle is not valid.");
    }

    public static void task16() {
        System.out.println("Enter Three Sides of Triangle :");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if(side1 == side2 && side2 == side3)
            System.out.println("Equilateral Triangle.");
        else if(side1 == side2 || side1 == side3 || side2 == side3)
            System.out.println("Isosceles Triangle.");
        else
            System.out.println("Scalene Triangle.");
    }

    public static void task17() {
        double a = 2.3, b = 4, c = 5.6;
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        } else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        } else {

            double real = -b / (2 * a);
            double img = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, img);
            System.out.format("\nroot2 = %.2f-%.2fi", real, img);
        }

    }

    public static void task18() {
        System.out.println("Enter The Cost Price :");
        int cp = scanner.nextInt();
        System.out.println("Enter The Selling Price :");
        int sp = scanner.nextInt();
        int p,l;
        if(sp>cp)
        {
            p = sp-cp;
            System.out.println("Profit : "+p);
        }
        else if(sp<cp)
        {
            l = cp-sp;
            System.out.println("Loss : "+l);
        }
        else
        {
            System.out.println("No Profit No Loss");
        }
    }

    public static void task19() {
        System.out.println("Enter The Five Subject Marks :");
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        int m4 = scanner.nextInt();
        int m5 = scanner.nextInt();
        int tot = m1+m2+m3+m4+m5;
        float per = tot/5;
        System.out.println("Total :"+tot);
        System.out.println("Percentage :"+per);
        if(per>=90)
            System.out.println("Grade A");
        else if(per>=80)
            System.out.println("Grade B");
        else if(per>=70)
            System.out.println("Grade C");
        else if(per>=60)
            System.out.println("Grade D");
        else if(per>=40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }

    public static void task20() {
        System.out.print("Enter The Basic Salary :");
        int bs = scanner.nextInt();
        float hra,da,tot;
        if(bs<=10000)
        {
            hra = bs*0.2f;
            da = bs*0.8f;
        }
        else if(bs<=20000)
        {
            hra = bs*0.25f;
            da = bs*0.9f;
        }
        else
        {
            hra = bs*0.3f;
            da = bs*0.95f;
        }
        System.out.println("Gross Salary : "+(bs+hra+da));
    }

    public static void task21() {
        System.out.print("Enter The Electricity Unit : ");
        int unit = scanner.nextInt();
        float amt,surcharge,bill_amt;
        if(unit<=50)
        {
            amt = unit*0.50f;
        }
        else if(unit<=150)
        {
            amt = unit*0.75f;
        }
        else if(unit<=250)
        {
            amt = unit*1.20f;
        }
        else
        {
            amt = unit*1.50f;
        }

        surcharge = amt*0.2f;
        bill_amt = amt+surcharge;
        System.out.println("Total Electricity Bill : "+bill_amt);
    }

    public static void task22() {
        System.out.print("Enter the Quantity Purchased : ");
        int qty = scanner.nextInt();
        System.out.print("Enter the Amount Per Item : ");
        float amt = scanner.nextFloat();
        float exp;
        if(qty>100)
        {
            exp = qty * amt;
            exp = exp-(exp * 0.1f);
        }
        else
        {
            exp = qty * amt;
        }
        System.out.println("Total Expenses is : "+exp);
    }

    public static void task23() {
        System.out.print("Enter the Current Year : ");
        int current_year = scanner.nextInt();
        System.out.print("Enter the Year of Joining : ");
        int join_year = scanner.nextInt();
        int diff = current_year - join_year;
        if(diff>3)
        {
            System.out.println("Bonus of Rs : 2500 /-");
        }
        else
        {
            System.out.println("No Bonus");
        }
    }

    public static void task24() {
        System.out.print("Enter the Basic Salary : ");
        float bs = scanner.nextFloat();
        float hra,da,gs;
        if(bs<1500)
        {
            hra=bs*0.1f;
            da=bs*0.9f;
        }
        else
        {
            hra=500;
            da=bs*0.98f;
        }
        gs = bs+hra+da;
        System.out.println("Gross Salary Rs:"+gs);
    }

    }




