package com.heatherwenzel.springdatademo;

import com.heatherwenzel.springdatademo.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

//@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = {"com.heatherwenzel.springdatademo.bootstrap"})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testMySql() {
        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(2);
    }

}
