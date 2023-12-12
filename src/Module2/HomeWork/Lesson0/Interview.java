package Module2.HomeWork.Lesson0;

public class Interview {
//    **Part1**: Создайте класс Interview. В данном классе имееются следующие *атрибуты*: *interviewer, interviewee, date,
//    topic, length*. Полe length отображает длину интервью в минутах, а все остальное это строки.
//    **Part2**: Данный класс содержит *методы*: *setInterviewer(String …), setInterviewee(String …), setDate(String …), setTopic(String …),
//    setLength(int …), getInterviewer(), getInterviewee(), getDate(), getTopic(), getLength()*.
//    Методы с префиксом get.. должны возвращать значение поля.
//    Методы с префиксом set.. ничего не возвращают, однако, их задача присвоить значение для полей.
//    **Part3**: Теперь создайте 3 объекта класса Interview. Для каждого объекта инициализируйте значения поле через set..
//    методы и выведите информацию по объекту используя get.. методы.
    private String interviewer;
    private String interviewee;
    private String date;
    private String topic;
    private int length;

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }
    public void setInterviewee(String interviewee) {
        this.interviewee = interviewee;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void getInterviewer() {
        System.out.println("interviewer: " + interviewer);
    }
    public void getInterviewee() {
        System.out.println("interviewee: " + interviewee);

    }
    public void getDate() {
        System.out.println("date: " + date);

    }
    public void getTopic() {
        System.out.println("topic: " + topic);

    }
    public void getLength() {
        System.out.println("length: " + length);
    }


}

class InterviewTask {
    public static void main(String[] args) {
        Interview interview1 = new Interview();
        interview1.setInterviewer("Michael Jackson");
        interview1.setInterviewee("Janett Jackson");
        interview1.setDate("11.22.33");
        interview1.setLength(123);
        interview1.setTopic("Family");
        interview1.getInterviewer();
        interview1.getInterviewee();
        interview1.getDate();
        interview1.getTopic();
        interview1.getLength();
    }
}
