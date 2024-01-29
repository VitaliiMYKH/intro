package mate.academy.intro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mate.academy.intro.dto.BookDto;
import mate.academy.intro.dto.CreateBookRequestDto;

@Service
public interface BookService {
    CreateBookRequestDto save(CreateBookRequestDto book);

    List<BookDto> findAll();
}
