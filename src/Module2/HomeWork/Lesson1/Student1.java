package Module2.HomeWork.Lesson1;

public class Student1 {
    //Создайте класс Студент с атрибутами:
    //Name (Имя и Фамилия)
    //Mark_math
    //Mark_english
    //Mark_programming
    //Выведите на экран студентов со средним балом по трем предметам от 4х и выше

    private String name;
    private int mark_math;
    private int mark_english;
    private int mark_programing;

    public Student1(String name, int mark_math, int mark_english, int mark_programing) {
        this.name = name;
        this.mark_math = mark_math;
        this.mark_english = mark_english;
        this.mark_programing = mark_programing;
    }

    public static double sredniiBal(double mark_math, double mark_english, double mark_programing) {
        double result = Math.floor((mark_math + mark_english + mark_programing)) / 3;
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark_math() {
        return mark_math;
    }

    public void setMark_math(int mark_math) {
        this.mark_math = mark_math;
    }

    public int getMark_english() {
        return mark_english;
    }

    public void setMark_english(int mark_english) {
        this.mark_english = mark_english;
    }

    public int getMark_programing() {
        return mark_programing;
    }

    public void setMark_programing(int mark_programing) {
        this.mark_programing = mark_programing;
    }
}

class Student1Test {
    public static void main(String[] args) {
        double result = 0;

        Student1 students[] = new Student1[5];
        students[0] = new Student1("Tomas Anderson", 5, 5, 4);
        students[1] = new Student1("Steve White", 3, 3, 4);
        students[2] = new Student1("Anna Smith", 4, 2, 5);
        students[3] = new Student1("Jackson Turley", 2, 4, 3);
        students[4] = new Student1("Katty Bree", 3, 5, 4);

        for (int i = 0; i < 5; i++) {
            result = Student1.sredniiBal(students[i].getMark_math(), students[i].getMark_english(), students[i].getMark_programing());
            if (result >= 4) {
                System.out.println(students[i].getName() + " " + result);
            }
        }
    }
}