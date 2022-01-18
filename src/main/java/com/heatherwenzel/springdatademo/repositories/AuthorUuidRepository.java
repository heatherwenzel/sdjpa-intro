package com.heatherwenzel.springdatademo.repositories;

import com.heatherwenzel.springdatademo.domain.AuthorUuid;
import com.heatherwenzel.springdatademo.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorUuidRepository extends JpaRepository<AuthorUuid, UUID> {
}