package mate.academy.intro.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


import lombok.RequiredArgsConstructor;
import mate.academy.intro.dto.BookDto;
import mate.academy.intro.dto.CreateBookRequestDto;
import mate.academy.intro.repository.BookRepository;

@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    @Autowired
    private final BookRepository bookRepository;

    @Override public CreateBookRequestDto save(CreateBookRequestDto book) {
        return bookRepository.save(book);
    }

    @Override public List<BookDto> findAll() {
        return bookRepository.fingAll();
    }
}
