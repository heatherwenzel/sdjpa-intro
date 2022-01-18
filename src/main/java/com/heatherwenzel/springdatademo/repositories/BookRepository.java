package com.heatherwenzel.springdatademo.repositories;

import com.heatherwenzel.springdatademo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
