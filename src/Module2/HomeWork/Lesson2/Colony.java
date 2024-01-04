package Module2.HomeWork.Lesson2;

public class Colony {

    private String name; //название
    private int smetPrice; //стоимость за квадратный метр
    private int apCount; //количество апартаментов
    private Apartment[] aparts; //Список апартаментов
}

class Apartment {
    private String title; // название
    private int smet; //количество квадратных метров
    private String type; //тип строения. может быть "Cyberbricks", "Carbonpanel" или "Nanolite"
}
