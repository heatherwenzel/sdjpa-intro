package com.heatherwenzel.sdjpaintro.repositories;

import com.heatherwenzel.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
