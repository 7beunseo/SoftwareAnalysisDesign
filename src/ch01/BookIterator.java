package ch01;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;
    public BookIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }
    @Override
    public boolean hasNext() {
        if(bookShelf.getLength() > index) return true;
        return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBook(index++);
    }
}
