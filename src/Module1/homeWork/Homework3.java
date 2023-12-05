package Module1.homeWork;

import java.util.Scanner;

public class Homework3 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task10();
    }

    public static void task1() {
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
        if(per>=60)
        {
            System.out.println("First Division.");
        }
        else if(per>=50 && per<=59)
        {
            System.out.println("Second Division.");
        }
        else if(per>=40 && per<=49)
        {
            System.out.println("Third  Division.");
        }
        else
        {
            System.out.println("Fail.");
        }
    }
    
    public static void task2() {
        System.out.print("Enter The Age :");
        int age = scanner.nextInt();
        System.out.print("Enter the Gender M/F :");
        char gen = scanner.next().charAt(0);
        System.out.print("Enter the Marital Status U/M :");
        char status = scanner.next().charAt(0);
        if(status == 'M' || status == 'm')
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'M' && age > 30 || status == 'u' && gen == 'm' && age > 30)
        {
            System.out.println("Driver should be Insured.");
        }
        else if(status == 'U' && gen == 'F' && age > 25 || status == 'u' && gen == 'f' && age > 25)
        {
            System.out.println("Driver should be Insured.");
        }
        else
        {
            System.out.println("Driver should not be Insured.");
        }
    }

    public static void task3() {
        System.out.print("Enter the Years of Service :");
        int yos = scanner.nextInt();
        System.out.print("Enter the Gender f/m :");
        char gen = scanner.next().charAt(0);
        System.out.print("Enter the Qualification (Graduate(0) , Post-Graduate(1)) :");
        int qual = scanner.nextInt();
        int salary = 0;
        if(gen=='m' && yos>=10 && qual==1)
        {
            salary = 15000;
        }
        else if( (gen=='m' && yos>=10 && qual==0) || ( gen=='m' && yos<10 && qual==1 ) || ( gen=='f' && yos<10 && qual==1))
        {
            salary = 10000;
        }
        else if(gen=='m' && yos<10 && qual==0)
        {
            salary = 7000;
        }
        else if(gen=='f' && yos>=10 && qual==1)
        {
            salary = 12000;
        }
        else if(gen=='f' && yos>=10 && qual==0)
        {
            salary = 9000;
        }
        else if(gen=='f' && yos<10 && qual==0)
        {
            salary = 6000;
        }
        System.out.println("Salary : " + salary);
    }

    public static void task4() {
        System.out.print("Enter the Digits :");
        int num = scanner.nextInt();
        int rem,sum = 0,a = num;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(a == sum)
            System.out.print("Eqaul..");
        else
            System.out.print("Not Eqaul..");
    }
    
    public static void task5() {
        System.out.print("Enter the Age of Ram :");
        int age1  = scanner.nextInt();
        System.out.print("Enter the Age of Shyam  :");
        int age2  = scanner.nextInt();
        System.out.print("Enter the Age of Ajay  :");
        int age3  = scanner.nextInt();
        if(age1<age2 && age1<age3)
            System.out.print("The Youngest Age is Ram");
        else if(age2<age1 && age2<age3)
            System.out.print("The Youngest Age is Shyam");
        else
            System.out.print("The Youngest Age is Ajay");
    }
    
    public static void task6() {
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

    public static void task7() {
        System.out.print("Enter The Number :");
        int num = scanner.nextInt();
        if(num<0)
            num = (-1)*num;
        System.out.print("Absolute Number is : "+num);
    }
    
    public static void task8() {
        System.out.print("Enter The Length  :");
        float len = scanner.nextFloat();
        System.out.print("Enter The Breadth :");
        float bre = scanner.nextFloat();
        float area = len * bre;
        float perimeter = 2 * (len+bre);
        System.out.println("Area of Rectangle : "+ area);
        System.out.println("Perimeter of Rectangle : "+ perimeter);
        if(area>perimeter)
        {
            System.out.println("Area of rectangle is greater than  Perimeter");
        }
        else
        {
            System.out.println("Perimeter of rectangle is greater than Area");
        }
    }

    public static void task9() {
        System.out.print("Enter The value of Hardness :");
        float hs = scanner.nextFloat();
        System.out.print("Enter The value of Carbon Content :");
        float cc = scanner.nextFloat();
        System.out.print("Enter The value of Tensile Strength :");
        float ts = scanner.nextFloat();
        float hs_f=0,cc_f=0,ts_f=0,grade;
        if(hs>50)
            hs_f=1;
        if(cc<0.7)
            cc_f=1;
        if(ts>5600)
            ts_f=1;
        if(hs_f==0 && cc_f==0 && ts_f==0)
            grade = 5;
        else if(hs_f==1 || cc_f==1 || ts==1)
            grade = 6;
        else if(hs_f==1 && cc_f==0 && ts_f==1)
            grade = 7;
        else if(hs_f==0 && cc_f==1 && ts_f==1)
            grade = 8;
        else if(hs_f==1 && cc_f==1 && ts_f==0)
            grade = 9;
        else
            grade = 10;
        System.out.println("The Grade of Steel  :"+ grade);
    }

    public static void task10() {
        System.out.print("Enter the number of days: ");
        int nDays = scanner.nextInt();
        float fMoneys = 0;

        if (nDays > 0 && nDays <= 5) {
            fMoneys = 0.50f * nDays;
        } else if (nDays >= 6 && nDays <= 10) {
            fMoneys = 1f * nDays;
        } else if (nDays > 10) {
            fMoneys = 5 * nDays;
        }

        if (nDays > 30) {
            System.out.println("Your membership would be canceled");
        } else {
            System.out.println("You have to pay: " + fMoneys);
        }
    }

    public static void task11() {
        System.out.print("Enter the Time Taken by Worker :");
        float hrs = scanner.nextFloat();
        if(hrs>=2 && hrs<=3)
        {
            System.out.println("Worker is Highly Efficient");
        }
        else if(hrs>3 && hrs <=4)
        {
            System.out.println("Worker Needs to Improve Speed");
        }
        else if(hrs>4 && hrs <=5)
        {
            System.out.println("Give Training to Worker");
        }
        else
        {
            System.out.println("Worker is Leave the Company");
        }
    }

    public static void task12() {
        System.out.print("Input first number: ");
        int x = scanner.nextInt();
        System.out.print("Input second number: ");
        int y = scanner.nextInt();
        System.out.print("Input third number: ");
        int z = scanner.nextInt();

        if (x == y && x == z)
        {
            System.out.println("All numbers are equal");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Neither all are equal or different");
        }
        else
        {
            System.out.println("All numbers are different");
        }
    }

    public static void task13() {
        System.out.print("Enter The Lessthan Ten Digits : ");
        if (scanner.hasNextLong())
        {

            long num = scanner.nextLong();

            if (num < 0)
            {
                num *= -1;
            }
            {
                int digits = 1;
                if (num >= 10 && num < 100)
                {
                    digits = 2;
                }
                else if (num >= 100 && num < 1000)
                {
                    digits = 3;
                }
                else if (num >= 1000 && num < 10000)
                {
                    digits = 4;
                }
                else if (num >= 10000 && num < 100000)
                {
                    digits = 5;
                }
                else if (num >= 100000 && num < 1000000)
                {
                    digits = 6;
                }
                else if (num >= 1000000 && num < 10000000)
                {
                    digits = 7;
                }
                else if (num >= 10000000 && num < 100000000)
                {
                    digits = 8;
                }
                else if (num >= 100000000 && num < 1000000000)
                {
                    digits = 9;
                }
                else if (num >= 1000000000 && num < 10000000000L)
                {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        }
        else
        {
            System.out.println("The number is not an integer");
        }
    }

    public static void task14() {
        System.out.print("Input First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input Second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input Third number: ");
        double num3 = scanner.nextDouble();
        if (num1 < num2 && num2 < num3)
        {
            System.out.println("Numbers are in Increasing Order");
        }
        else if (num1 > num2 && num2 > num3)
        {
            System.out.println("Numbers are in Decreasing Order");
        }
        else
        {
            System.out.println("Neither Increasing or Decreasing Order");
        }
    }

    public static void task15() {
        int num = scanner.nextInt();
        if(num%5==0)
        {
            System.out.println(num+" is a Multiple of 5");
        }
        else
        {
            System.out.println(num+" is not a Multiple of 5");
        }
    }
    
    

    }
