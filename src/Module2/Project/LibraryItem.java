package Module2.Project;

public abstract class LibraryItem {

    private int id;
    private String name;
    private boolean isAvailable;


    public LibraryItem() {}
    public LibraryItem(int id, String name, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public abstract void displayDetails();

}

class Book extends LibraryItem implements BorrowableItem, PaperItem {

    String author;
    String title;
    String isbn;

    @Override
    public void displayDetails() {

    }
}

class DVD extends LibraryItem implements BorrowableItem {

    int runtime;


    @Override
    public void displayDetails() {

    }
}

class Magazine extends LibraryItem implements BorrowableItem, PaperItem {

    long issueNumber;
    String issuer;

    @Override
    public void displayDetails() {
        
    }
}