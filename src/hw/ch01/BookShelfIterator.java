package hw.ch01;

import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(bookShelf.getLength() > index) return true;
        return false;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
