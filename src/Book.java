import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearOfPublication;

    public Book(String name, Author author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    @Override
    public String toString() {
        return "Название книги-" + this.name + "/" + "Автор книги-" + author.toString() + "/" + "Релиз-" + this.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublication);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return false;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
}
