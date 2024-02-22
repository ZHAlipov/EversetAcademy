package Module2.Project;

public abstract class User {

     int id;
     String login, password, firstName, lastName, role;

    public User(int id, String login, String password, String firstName, String lastName, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public abstract void activate();
     public abstract void deActivate();

     public abstract void login();
     public abstract void logout();

}

class Librarian extends User {

    int workExperience;

    public Librarian(int id, String login, String password, String firstName, String lastName, String role) {
        super(id, login, password, firstName, lastName, role);
    }

    @Override
    public void activate() {

    }

    @Override
    public void deActivate() {

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

}

class Member extends User {

    private BorrowableItem[] borrowableItems;
    private boolean isActive;


    public Member(int id, String login, String password, String firstName, String lastName, String role) {
        super(id, login, password, firstName, lastName, role);
    }

    @Override
    public void activate() {
        isActive = true;
    }

    @Override
    public void deActivate() {
        isActive = false;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    public void checkAccountStatus() {}



}


