package br.com.dev.rq.rest_springboot.repository;

import br.com.dev.rq.rest_springboot.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> { }
