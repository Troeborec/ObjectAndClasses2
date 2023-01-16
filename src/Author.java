import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;

    }

    @Override
    public String toString() {
        return firstName + "" + lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return false;
        if (other == null || this.getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
}

