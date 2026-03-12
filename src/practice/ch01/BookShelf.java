package practice.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
// public class BookShelf {
    private List<Book> books; // 배열 선언
    private int last = 0; // 책의 마지막 위치

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize); //배열 생성
    }

    public Book getBookAt(int index) { // 첵을 가져오는 메소드
        return books.get(index);
    }

    public void appendBook(Book book) { // 책을 추가하는 메소드
        books.add(book);
    }

    public int getLength() { // 책의 개수를 반환하는 메소드
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() { // 자기 자신(현재 책꽂이)의 iterator를 생성해서 반환
        return new BookShelfIterator(this); // this :  현재 객체(책꽂이)를 가리킴
    }
}
