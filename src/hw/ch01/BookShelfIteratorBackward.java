package hw.ch01;

import java.util.Iterator;

public class BookShelfIteratorBackward implements Iterator<Book> {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIteratorBackward(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = bookShelf.getLength() -1;
    }
    @Override
    public boolean hasNext() {
        if(index < 0) return false;
        return true;
    }

    @Override
    public Book next() {
        return bookShelf.getBookAt(index--);
    }
}
