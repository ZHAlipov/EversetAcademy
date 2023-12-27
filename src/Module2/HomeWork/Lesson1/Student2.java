package Module2.HomeWork.Lesson1;

public class Student2 {

    private String name;
    private double average_mark;
    private double scholarship;

    public Student2(String name, double average_mark, double scholarship) {
        this.name = name;
        this.average_mark = average_mark;
        this.scholarship = scholarship;
    }

    public void increaseScholarship(String name, double average_mark, double scholarship) {
        if (average_mark > 4.5) {
            System.out.println(name + " " + average_mark + " " + (scholarship+(scholarship*0.30)));
        } else if (average_mark < 2) {
            return;
        } else {System.out.println(name + " " + average_mark + " " + (scholarship+(scholarship*0.10)));
        }

    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}
    public double getAverage_mark() {return this.average_mark;}
    public void setAverage_mark(double average_mark) {this.average_mark = average_mark;}
    public double getScholarship() {return this.scholarship;}
    public void setScholarship(double scholarship) {this.scholarship = scholarship;}
}

class Student2Test {
    public static void main(String[] args) {

        Student2 students[] = new Student2[5];
        students[0] = new Student2("Medet", 3.5, 20000);
        students[1] = new Student2("Azamat", 4.7, 20000);
        students[2] = new Student2("Ali", 1.6, 20000);
        students[3] = new Student2("Togzhan", 2.9, 20000);
        students[4] = new Student2("Aidana", 4.8, 20000);

        for (int i = 0; i < students.length; i++) {
            students[i].increaseScholarship(students[i].getName(), students[i].getAverage_mark(), students[i].getScholarship());
        }
    }
}