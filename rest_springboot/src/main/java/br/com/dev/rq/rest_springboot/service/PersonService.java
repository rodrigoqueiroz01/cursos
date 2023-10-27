package br.com.dev.rq.rest_springboot.service;

//import br.com.dev.rq.rest_springboot.data.mapper.DozerMapper;

import br.com.dev.rq.rest_springboot.data.model.Person;
import br.com.dev.rq.rest_springboot.data.dto.PersonDTO;
import br.com.dev.rq.rest_springboot.exception.DataAlreadyExistsException;
import br.com.dev.rq.rest_springboot.exception.EntityNotFoundException;
import br.com.dev.rq.rest_springboot.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Log
@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public List<Person> findAll() {
        log.info("Buscando todas as pessoas!");
        return repository.findAll();
    }

    public Person findById(Long id) {
        log.info("Buscando uma pessoa pelo ID!");
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Código não encontrado."));
    }

    public Person save(Person person) {
        log.info("Criando uma pessoa!");

        if (Objects.nonNull(repository.findByDocument(person.getDocument()))) {
            throw new DataAlreadyExistsException("CPF já cadastrado.");
        }

        return repository.save(person);
    }

    public Person update(Person person, Long id) {
        log.info("Atualizando uma pessoa!");
        findById(id);
        person.setId(id);
        return repository.save(person);
    }

    public void delete(Long id) {
        log.info("Deletando uma pessoa pelo ID!");
        var person = findById(id);
        repository.deleteById(person.getId());
    }

}
