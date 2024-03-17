package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20220961 김은서");
        BookShelf bs1 = new BookShelf(6);
        bs1.appendBook(new Book("자료구조론", "박우창")); // 메인 메서드 안에 넣어야 에러가 안남
        bs1.appendBook(new Book("소프트웨어분석설계", "최승훈"));
        bs1.appendBook(new Book("프로그래머수학", "이주영"));
        bs1.appendBook(new Book("컴퓨터동작원리", "유견아"));
        bs1.appendBook(new Book("컴퓨터그래픽스", "이경미"));
        bs1.appendBook(new Book("동물농장", "김은서"));

        // 순서대로 출력
        // iterator 사용
        Iterator<Book> it = bs1.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName()+ " => " + book.getAuthor());
        }
        System.out.println("====");

        // 확장 for문 사용
        for(Book book : bs1) {
            System.out.println(book.getName()+ " => " + book.getAuthor());
        }
        System.out.println("====");

        // 역순으로 출력
        System.out.println("역순으로 출력");
        Iterator<Book> backIt = bs1.iteratorBackward();
        while(backIt.hasNext()) {
            Book book = backIt.next();
            System.out.println(book.getName()+ " => " + book.getAuthor());
        }

    }

}
