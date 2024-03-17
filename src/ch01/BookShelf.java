package ch01;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Iterable<Book>{
    List<Book> books;

    public BookShelf(int bookSize) {
        books = new ArrayList<>(bookSize);
    }

    // 책꽂이에 꽂음
    public void insertBook(Book book) {
        books.add(book);
    }

    // 책 꺼내옴
    public Book getBook(int idx) {
        return books.get(idx);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public BookShelfIterator iterator() {
        return new BookShelfIterator(this);
    }
}
