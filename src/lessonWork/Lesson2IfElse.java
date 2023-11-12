package lessonWork;

import java.util.Scanner;

public class Lesson2IfElse {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    elevenEnhanced();
  }

  public static void one() {
    int x = 7;
    if (x < 7) {
      System.out.println("x is lower than 7");
    } else {
      System.out.println("x is bigger than 7");
    }

    System.out.println("the end...");
  }

  public static void two() {
    int x = 8;
    if (x == 8) {
      System.out.println("woow is 8");
    } else {
      System.out.println("x is not 8");
    }
  }

  public static void three() {
    int x = scanner.nextInt();
    if (x > 100)
    {
      System.out.println("x is more than 100");
    }
    else if (x == 100)
    {
      System.out.println("x is 100");
    }
    else
    {
      System.out.println("x is less than 100");
    }
  }

  public static void four() {
    int x = scanner.nextInt();
    if (x >= 200) {
      System.out.println("You can't use such big number here...");
    } else {
      if (x > 100)
      {
        System.out.println("x is more than 100");
      }
      else if (x == 100)
      {
        System.out.println("x is 100");
      }
      else
      {
        System.out.println("x is less than 100");
      }
    }
  }

  public static void five() {
    int x = scanner.nextInt();
    if (x < 200) {
      if (x > 100)
      {
        System.out.println("x is more than 100");
      }
      else if (x == 100)
      {
        System.out.println("x is 100");
      }
      else
      {
        System.out.println("x is less than 100");
      }
    }
  }

  public static void six() {
    int x = scanner.nextInt();

    if (x >= 200) {
      System.out.println("no");
      return;
    }

    if (x > 100)
    {
      System.out.println("x is more than 100");
    }
    else if (x == 100)
    {
      System.out.println("x is 100");
    }
    else
    {
      System.out.println("x is less than 100");
    }
  }

  public static void seven() {
    int x = scanner.nextInt();

    if (x >= 90)
    {
      System.out.println("A");
    }
    else if (x >= 70)
    {
      System.out.println("B");
    }
    else if (x >= 55)
    {
      System.out.println("C");
    }
    else if (x >= 40) {
      System.out.println("D");
    }

    System.out.println("End.");
  }

  public static void eight() {
    int x = scanner.nextInt();

    if (x >= 90)
    {
      System.out.println("A");
    }
     if (x >= 70)
    {
      System.out.println("B");
    }
     if (x >= 55)
    {
      System.out.println("C");
    }
     if (x >= 40) {
      System.out.println("D");
    }

    System.out.println("End.");
  }

  public static void nine() {
    int x = scanner.nextInt();
    boolean a = x < 100;
    boolean b = x <= 100;
    boolean c = x > 100;
    boolean d = x >= 100;
    boolean e = x == 100;
    boolean f = x != 100;

    if (f) {
      System.out.println("x is not 100");
    }

    System.out.println("End.");
  }

  public static void ten() {
    int x = scanner.nextInt();
    boolean a = x < 100;
    boolean b = x <= 100;
    boolean c = x > 100;
    boolean d = x >= 100;
    boolean e = x == 100;
    boolean f = x != 100;

    if (f && e || d || a && b) {
      System.out.println("x is not 100");
    }

    System.out.println("End.");
  }

  public static void eleven() {
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    boolean isAnyPositive = (x > 0) || (y > 0); // or
    boolean isAnyNegative = (x < 0) || (y < 0); // or
    boolean isAllPositive = (x > 0) && (y > 0); // and
    boolean isAllNegative = (x < 0) && (y < 0); // and

    System.out.println(isAnyPositive);
    System.out.println(isAnyNegative);
    System.out.println(isAllPositive);
    System.out.println(isAllNegative);

  }

  public static void elevenEnhanced() {
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    boolean isPositiveX = x > 0;
    boolean isPositiveY = y > 0;
    boolean isNegativeX = x < 0;
    boolean isNegativeY = y < 0;

    boolean isAnyPositive = isPositiveX || isPositiveY; // or
    boolean isAnyNegative = isNegativeX || isNegativeY; // or
    boolean isAllPositive = (x > 0) && (y > 0); // and
    boolean isAllNegative = (x < 0) && (y < 0); // and

    System.out.println(isAnyPositive);
    System.out.println(isAnyNegative);
    System.out.println(isAllPositive);
    System.out.println(isAllNegative);

  }
}
