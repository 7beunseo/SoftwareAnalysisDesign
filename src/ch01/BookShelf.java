package ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    Book books[];
    int index = 0;

    public BookShelf(int bookSize) {
        books = new Book[bookSize];
    }

    // 책꽂이에 꽂음
    public void insertBook(Book book) {
        books[index++] = book;
    }

    // 책 꺼내옴
    public Book getBook(int idx) {
        return books[idx];
    }

    public int getLength() {
        return index;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }
}
