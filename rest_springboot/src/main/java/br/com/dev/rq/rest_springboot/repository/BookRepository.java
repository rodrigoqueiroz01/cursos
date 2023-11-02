package br.com.dev.rq.rest_springboot.repository;

import br.com.dev.rq.rest_springboot.data.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.title LIKE LOWER(CONCAT('%',:title,'%'))")
    Page<Book> findBooksByTitle(@Param("title") String title, Pageable pageable);

}
