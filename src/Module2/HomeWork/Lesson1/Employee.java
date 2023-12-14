package Module2.HomeWork.Lesson1;

import Module2.ClassWork.Lesson1.ComplexNumber;

public class Employee {
    //– Создайте класс с именем `Сотрудник` с атрибутами для имени, идентификатора сотрудника и зарплаты.
    //- Внедрите метод "равно" для сравнения двух объектов "Сотрудник" на основе их идентификатора сотрудника.
    //- Определите метод тестирования для сравнения двух сотрудников с разными сценариями: один и тот же идентификатор,
    // разные идентификаторы и объекты разных типов.
    //– Распечатайте результаты сравнения, используя метод «равно».

    private String name = "Stark";
    private int employee_ID = 1;
    private int salary = 100000;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee that = (Employee) obj;
        return name == that.name && employee_ID == that.employee_ID && salary == that.salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee3.setName("Markul");
        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.equals(employee3));
        System.out.println(employee1 == employee2);
        System.out.println("Hello!");
    }
}