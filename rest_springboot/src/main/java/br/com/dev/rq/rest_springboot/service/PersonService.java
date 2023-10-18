package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.exception.UnsupportedMathOperationException;
import br.com.dev.rq.rest_springboot.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Log
@Service
@AllArgsConstructor
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public List<Person> findAll() {
        log.info("Finding all persons!");

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            var person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    public Person findById(String id) {
        log.info("Finding one person!");

        var person = Person.builder()
                .id(counter.incrementAndGet())
                .firstName("Rodrigo")
                .lastName("Queiroz")
                .address("Fortaleza - Ceará - Brasil")
                .gender("Male")
                .build();

        return person;
    }

    private Person mockPerson(int i) {
        var person = Person.builder()
                .id(counter.incrementAndGet())
                .firstName("Person name " + i)
                .lastName("Last name " + i)
                .address("Some address in Brasil" + i)
                .gender("Male")
                .build();

        return person;
    }

}
