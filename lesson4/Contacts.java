package lesson4;

public final class Contacts {
    private final String firstName;
    private final String lastName;

    public Contacts(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + "-" + lastName + "-" + lastName;
    }
}
