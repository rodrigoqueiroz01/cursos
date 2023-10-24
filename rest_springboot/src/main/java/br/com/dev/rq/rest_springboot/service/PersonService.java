package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.data.mapper.DozerMapper;
import br.com.dev.rq.rest_springboot.exception.EntityNotFoundException;
import br.com.dev.rq.rest_springboot.data.model.Person;
import br.com.dev.rq.rest_springboot.data.vo.PersonVO;
import br.com.dev.rq.rest_springboot.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public List<PersonVO> findAll() {
        log.info("Buscando todas as pessoas!");
        var person = repository.findAll();
        return DozerMapper.parseListObjects(person, PersonVO.class);
    }

    public PersonVO findById(Long id) {
        log.info("Buscando uma pessoa pelo ID!");
        var person = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("ID não encontrado. Informe um ID correto!"));
        return DozerMapper.parseObject(person, PersonVO.class);
    }

    public PersonVO save(PersonVO vo) {
        log.info("Criando uma pessoa!");
        var person = DozerMapper.parseObject(vo, Person.class);
        return DozerMapper.parseObject(repository.save(person), PersonVO.class);
    }

    public PersonVO update(PersonVO vo, Long id) {
        log.info("Atualizando uma pessoa!");
        findById(id);
        vo.setId(id);
        return DozerMapper.parseObject(save(vo), PersonVO.class);
    }

    public void delete(Long id) {
        log.info("Deletando uma pessoa pelo ID!");
        var person = findById(id);
        repository.deleteById(person.getId());
    }

}
