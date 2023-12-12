package Module2.HomeWork.Lesson1;

public class Student {
//– Создайте класс под названием «Студент», который будет содержать информацию об учащемся, включая имя,
//    идентификатор учащегося и оценки по трем предметам.
//— Определите конструктор, который принимает всю информацию в качестве аргументов и инициализирует соответствующие поля.
//- Создайте два объекта ученика с разной информацией с помощью конструктора.
//- Распечатайте детали каждого объекта ученика, используя соответствующие методы.

    private String name;
    private int studentId;
    private int gradesMath;
    private int gradesGeography;
    private int gradesPhisic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGradesMath() {
        return gradesMath;
    }

    public void setGradesMath(int gradesMath) {
        this.gradesMath = gradesMath;
    }

    public int getGradesGeography() {
        return gradesGeography;
    }

    public void setGradesGeography(int gradesGeography) {
        this.gradesGeography = gradesGeography;
    }

    public int getGradesPhisic() {
        return gradesPhisic;
    }

    public void setGradesPhisic(int gradesPhisic) {
        this.gradesPhisic = gradesPhisic;
    }

    public Student() {}

    public Student(String name, int studentId, int gradesMath, int gradesGeography, int gradesPhisic) {
        this.name = name;
        this.studentId = studentId;
        this.gradesMath = gradesMath;
        this.gradesGeography = gradesGeography;
        this.gradesPhisic = gradesPhisic;
    }
}

    class StudentTest {
        public static void main(String[] args) {
            Student student1 = new Student("Markle", 135, 4, 4, 5);
            System.out.println(student1.getStudentId());
            System.out.println(student1.getName());
            System.out.println(student1.getGradesMath());
            System.out.println(student1.getGradesPhisic());
            System.out.println(student1.getGradesGeography());
            System.out.println();

            Student student2 = new Student("Tony", 256, 3, 3, 4);
            System.out.println(student2.getStudentId());
            System.out.println(student2.getName());
            System.out.println(student2.getGradesMath());
            System.out.println(student2.getGradesPhisic());
            System.out.println(student2.getGradesGeography());
        }
    }