package hw.ch01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BookShelfYearIterator implements Iterator<Book> {
    private final List<Book> sortedBooks;
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        this.sortedBooks = new ArrayList<>();
        for (Book book : bookShelf) {
            if (book != null) {
                sortedBooks.add(book);
            }
        }
        this.sortedBooks.sort(Comparator.comparingInt(Book::getYear).reversed());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks.get(index++);
    }
}