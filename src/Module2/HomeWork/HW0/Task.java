package Module2.HomeWork.HW0;

public class Task {
//    Part1: Создайте класс Task. Данный класс состоит из данных атрибутов: description, type, assignee, issuer, issueDate.
//      Все атрибуты имеют тип String.
//      Скажем что для атрибута type у нас могут быть только эти значения: normal, major, critical.
//    Part2: Дополнительно у класса Task есть методы: getDescription(), getType(), getAssignee(), getIssuer(), getIssueDate().
//      Они возвращают значения полей объекта.
//    Part3: Создайте 3 объекта класса Task, инициализируйте значения этих объектов. Информацию по этим объектам необходимо
//      вывести при помощи методов с префиксом get в имени.
    public String description;
    public String type;
    public String assignee;
    public String issuer;
    public String issueDate;

    public void getDescription() {
        System.out.println("description: " + description);
    }
    public void getType() {
        System.out.println("type: " + type);
    }
    public void getAssignee() {
        System.out.println("assignee: " + assignee);
    }
    public void getIssuer() {
        System.out.println("issuer: " + issuer);
    }
    public void getIssueDate() {
        System.out.println("issueDate: " + issueDate);
    }
}

class Task2 {
    public static void main(String[] args) {
        Task task1 = new Task();
        task1.assignee = "1";
        task1.description = "Описание 1";
        task1.issueDate = "11.11.2011";
        task1.type = "normal";
        task1.issuer = "zxc";
        task1.getAssignee();
        task1.getDescription();
        task1.getIssueDate();
        task1.getIssuer();
        task1.getType();
        System.out.println();

        Task task2 = new Task();
        task2.assignee = "2";
        task2.description = "Описание 2";
        task2.issueDate = "22.22.2022";
        task2.type = "major";
        task2.issuer = "vbn";
        task2.getAssignee();
        task2.getDescription();
        task2.getIssueDate();
        task2.getIssuer();
        task2.getType();
        System.out.println();

        Task task3 = new Task();
        task3.assignee = "3";
        task3.description = "Описание 3";
        task3.issueDate = "12.12.2012";
        task3.type = "critical";
        task3.issuer = "m,.";
        task3.getAssignee();
        task3.getDescription();
        task3.getIssueDate();
        task3.getIssuer();
        task3.getType();
    }
}
