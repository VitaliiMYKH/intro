package mate.academy.intro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;

import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //not null
    @Column(nullable = false)
    private String title;
    private String author;
    //nn + unique
    @Column(unique = true)
    private String isbn;
    @Column(unique = true)
    private BigDecimal price;

    private String description;
    private String coverImage;
}
