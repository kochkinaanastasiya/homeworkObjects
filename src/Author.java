import java.util.Objects;

public class Author {
    private String firstName;
    private String surName;
    public Author(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurName(){
        return surName;
    }
    @Override
    public String toString(){
        return firstName + " " + surName;
    }
    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
       Author author1 = (Author) obj;
        return firstName.equals(author1.firstName) && surName.equals(author1.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName + surName);
    }
}
