package Module2.HomeWork.Lesson2;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }
    public int getMinute() {return  this.minute;}
    public int getSecond() {return this.second;}

    public void setHour(int hour) {this.hour = hour;}
    public void setMinute(int minute) {this.minute = minute;}
    public void setSecond(int second) {this.second = second;}
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return ((hour<10) ? ("0" + hour) : hour) + ":" + ((minute < 10) ? ("0" + minute) : minute) + ":" + ((second < 10) ? ("0" + second) : second);
    }

    public Time nextSecond() {
        second++;

        if (second >= 60) {
            second = 0;
            minute++;

            if (minute >= 60) {
                minute = 0;
                hour++;

                if (hour >= 24) {
                    hour = 0;
                }
            }
        }

        return new Time(hour, minute, second);
    }

    public Time previousSecond() {
        second--;

        if (second < 0) {
            second = 59;
            minute--;

            if (minute < 0) {
                minute = 59;
                hour--;

                if (hour < 0) {
                    hour = 23;
                }
            }
        }

        return new Time(hour, minute, second);
    }
}

class TimeTest {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }
}