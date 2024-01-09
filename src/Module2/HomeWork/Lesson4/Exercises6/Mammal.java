package Module2.HomeWork.Lesson4.Exercises6;

public class Mammal extends Animal {

        public Mammal(String name) {
            super(name);
        }

        @Override
        public String toString() {
            return "Mamaml[%s\"]".formatted(super.toString());
        }
}
