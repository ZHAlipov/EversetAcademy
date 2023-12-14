package Module2.ClassWork.Lesson2;

public class Employee {
    //Класс под названием «Сотрудник», который моделирует сотрудника с идентификатором, именем и зарплатой, спроектирован,
    // как показано на следующей диаграмме классов. Метод `raiseSalary(percent)`  увеличивает зарплату на заданный процент. Напишите класс ``Сотрудник``.
    //Обратите внимание на два метода: getName(), getAnnualSalary() и RaiseSalary(int проценты).

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNane() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSallary() {
        return  salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary = salary + (salary * percent) / 100;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sasha", "Petrov", 100000);
        System.out.println(employee1.getName());
        System.out.println("id:" + employee1.getId());
        System.out.println("first name:" + employee1.getFirstName());
        System.out.println("last name:" + employee1.getLastNane());
        System.out.println("salary:" + employee1.getSalary() + "tg");
        System.out.println("AnnualSallary:" + employee1.getAnnualSallary() + "tg");
        System.out.println(employee1.toString());

    }
}
