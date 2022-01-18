package com.heatherwenzel.springdatademo.repositories;

import com.heatherwenzel.springdatademo.domain.AuthorUuid;
import com.heatherwenzel.springdatademo.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookUuidRepository extends JpaRepository<BookUuid, UUID> {
}