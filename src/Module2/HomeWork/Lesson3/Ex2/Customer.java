package Module2.HomeWork.Lesson3.Ex2;

public class Customer {

    private int id, discount;
    private String name;

    public Customer(int id, String name, int discount) {
        this.id=id;
        this.name=name;
        this.discount=discount;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getDiscount() {
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "name(%s)(%s%%)".formatted(id, discount);
    }

}


