package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.exception.EntityNotFoundException;
import br.com.dev.rq.rest_springboot.model.Person;
import br.com.dev.rq.rest_springboot.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Log
@Service
@AllArgsConstructor
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    private final PersonRepository repository;

    public List<Person> findAll() {
        log.info("Buscando todas as pessoas!");
        return repository.findAll();
    }

    public Person findById(Long id) {
        log.info("Buscando uma pessoa pelo ID!");
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("ID não encontrado. Informe um ID correto!"));
    }

    public Person save(Person person) {
        log.info("Criando uma pessoa!");
        return repository.save(person);
    }

    public Person update(Person person, Long id) {
        log.info("Atualizando uma pessoa!");
        findById(id);
        person.setId(id);
        return save(person);
    }

    public void delete(Long id) {
        log.info("Deletando uma pessoa pelo ID!");
        var person = findById(id);
        repository.deleteById(person.getId());
    }

}
