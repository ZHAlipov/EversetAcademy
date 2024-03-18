package Module3.HomeWork.ArrayList.Ex1;

import java.util.*;

public class Student {

    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public int getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for(Integer grade: grades) {
            sum += grade;
        }
        return sum / grades.size();
    }





}

class TestStudent {

    public static void deleteStudentIfAvgGradeIsLow(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (course == student.getCourse()) {
                System.out.printf("Студент %s, курс %s%n".formatted(student.getName(), student.course));
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tom", "A1", 1, List.of(2, 2, 2, 2, 3)));
        students.add(new Student("Carl", "B1", 1, List.of(4, 4, 4, 4, 5)));
        students.add(new Student("Sara", "C1", 2, List.of(5, 5, 5, 5, 5)));


        printStudents(students, 1);

        deleteStudentIfAvgGradeIsLow(students);
        System.out.println();
        printStudents(students, 2);

    }

}


