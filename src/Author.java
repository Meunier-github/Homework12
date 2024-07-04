import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor,String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    @Override
    public String toString() {
        return "Автор: " + nameAuthor + ' ' + surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}

