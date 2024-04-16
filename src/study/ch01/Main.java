package study.ch01;

public class Main {
    public static void main(String[] args) {
        BookShelf bs1 = new BookShelf(5);
        bs1.insertBook(new Book("book1"));
        bs1.insertBook(new Book("book2"));
        bs1.insertBook(new Book("book3"));
        BookShelfIterator br = bs1.iterator();

        while(br.hasNext()) {
            Book book = br.next();
            System.out.println(book.getName());
        }

        for(Book book : bs1) {
            System.out.println(book.getName());
        }
    }

}
