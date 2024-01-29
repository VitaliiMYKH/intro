package mate.academy.intro.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import mate.academy.intro.model.Book;

@Service
public interface BookRepository {
    Book save(Book book);

    List<Book> fingAll();
}
