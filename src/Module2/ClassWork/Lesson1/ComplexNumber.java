package Module2.ClassWork.Lesson1;

import java.util.Objects;

public class ComplexNumber {

    public int real;
    public int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void sum(ComplexNumber added) {
        this.real += added.real;
        imaginary += added.imaginary;
    }

    public void subtract(ComplexNumber subtracted) {
        real -= subtracted.real;
        imaginary -= subtracted.imaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplexNumber that)) {
            return false;
        }
        return real == that.real && imaginary == that.imaginary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}