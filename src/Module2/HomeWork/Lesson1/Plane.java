package Module2.HomeWork.Lesson1;

public class Plane {
//    Создайте класс Plane
//    Id(string)
//    Arrival_time(string)
//    leave_time(string)
//    выведите все самолеты, которые провели в полете больше 2х часов
    private String id;
    private String arrival_time;
    private String leave_time;

    public Plane(String id, String arrival_time, String leave_time) {
        this.id = id;
        this.arrival_time=arrival_time;
        this.leave_time=leave_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getLeave_time() {
        return leave_time;
    }

    public void setLeave_time(String leave_time) {
        this.leave_time = leave_time;
    }

    public static int vremyaPoletaVMin(String arrival_time, String leave_time) {
        int arrivalHour = Integer.parseInt(arrival_time.split(":")[0]);
        int arrivalMinute = Integer.parseInt(arrival_time.split(":")[1]);

        int leaveHour = Integer.parseInt(leave_time.split(":")[0]);
        int leaveMinute = Integer.parseInt(leave_time.split(":")[1]);

        int arrivalAllTime = arrivalHour * 60 + arrivalMinute;
        int leaveAllTime = leaveHour * 60 + leaveMinute;

        return leaveAllTime - arrivalAllTime;

    }

}

class PlaneTest {

    public static void main(String[] args) {
        int result = 0;

        Plane planes[] = new Plane[7];
        planes[0] = new Plane("ABC", "12:05", "12:45");
        planes[1] = new Plane("DWE", "12:00", "12:30");
        planes[2] = new Plane("ABC", "15:20", "18:40");
        planes[3] = new Plane("OYH", "12:00", "12:10");
        planes[4] = new Plane("LQW", "15:20", "17:50");
        planes[5] = new Plane("BDF", "12:15", "15:43");
        planes[6] = new Plane("TNE", "15:41", "16:00");

        for (int i = 0; i < 7; i++) {
            result = Plane.vremyaPoletaVMin(planes[i].getArrival_time(), planes[i].getLeave_time());
            if (result >= 120) {
                System.out.println(planes[i].getId() + " " + planes[i].getArrival_time() + " " + planes[i].getLeave_time());
            }
        }












    }

}
