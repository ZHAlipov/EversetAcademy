package Module2.HomeWork.Lesson3.Ex1;

public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
      this.name = name;
      this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author [name=\"%s\",email=\"%s\"]".formatted(this.name, this.email);
    }
}
