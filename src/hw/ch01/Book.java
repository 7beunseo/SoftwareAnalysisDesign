package hw.ch01;

public class Book {
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    private String name;
    private String author;

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
}
