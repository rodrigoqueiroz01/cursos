package br.com.dev.rq.rest_springboot.repository;

import br.com.dev.rq.rest_springboot.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByDocument(String document);
}
