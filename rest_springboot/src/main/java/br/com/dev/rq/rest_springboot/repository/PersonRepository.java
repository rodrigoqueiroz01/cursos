package br.com.dev.rq.rest_springboot.repository;

import br.com.dev.rq.rest_springboot.data.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("SELECT u FROM Person u WHERE u.document = :document")
    Person findByDocument(String document);

    @Query("SELECT p FROM Person p WHERE p.firstName LIKE LOWER(CONCAT('%',:firstName,'%'))")
    Page<Person> findPersonsByName(@Param("firstName") String firstName, Pageable pageable);

    @Modifying
    @Query("UPDATE Person p SET p.enabled = false WHERE p.id = :id")
    void disablePerson(@Param("id") Long id);

}
