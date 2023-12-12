package Module2.ClassWork.Lesson2;

public class Car {
//    3. Модификаторы доступа:
//    Создайте класс "Car" с приватным полем speed. Добавьте публичный метод "start", который устанавливает значение speed равным 0,
//    и метод "accelerate", который увеличивает скорость на заданную величину. Обеспечьте, чтобы speed нельзя было прямо изменить извне класса.
    private int speed;
    public void start() {
      this.speed = 0;
    };

    public void accelerate(int speed) {
        this.speed += speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class CarTest {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.start();
    System.out.println(car1.getSpeed());
    car1.accelerate(33);
    System.out.println(car1.getSpeed());
    }
}
