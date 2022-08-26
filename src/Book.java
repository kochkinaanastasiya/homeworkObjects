import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "name = " + name + " author = " + author.toString() + " yearPublication = " + yearPublication;
    }

    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book1 = (Book) obj;
        return name.equals(book1.name) && author.equals(book1.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name + author.toString() + yearPublication);
    }

}
