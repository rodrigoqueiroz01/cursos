package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.controller.PersonController;
import br.com.dev.rq.rest_springboot.data.mapper.PersonMapper;
import br.com.dev.rq.rest_springboot.data.vo.PersonVO;
import br.com.dev.rq.rest_springboot.exception.DataAlreadyExistsException;
import br.com.dev.rq.rest_springboot.exception.EntityNotFoundException;
import br.com.dev.rq.rest_springboot.exception.RequiredObjectIsNullException;
import br.com.dev.rq.rest_springboot.repository.PersonRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    private final PagedResourcesAssembler<PersonVO> assembler;;

    public PagedModel<EntityModel<PersonVO>> findAll(Pageable pageable) {
        var personVosPage = repository.findAll(pageable).map(PersonMapper::toPersonVO);
        personVosPage.map(vo -> vo.add(linkTo(methodOn(PersonController.class).findById(vo.getId())).withSelfRel()));
        var link = linkTo(methodOn(PersonController.class).findAll(pageable.getPageNumber(), pageable.getPageSize(), "asc")).withSelfRel();
        return assembler.toModel(personVosPage, link);
    }

    public PagedModel<EntityModel<PersonVO>> findPersonsByName(String firstName, Pageable pageable) {
        var personVosPage = repository.findPersonsByName(firstName, pageable).map(PersonMapper::toPersonVO);
        personVosPage.map(vo -> vo.add(linkTo(methodOn(PersonController.class).findById(vo.getId())).withSelfRel()));
        var link = linkTo(methodOn(PersonController.class).findAll(pageable.getPageNumber(), pageable.getPageSize(), "asc")).withSelfRel();
        return assembler.toModel(personVosPage, link);
    }

    public PersonVO findById(Long id) {
        var vo = PersonMapper.toPersonVO(repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pessoa não encontrada")));
        vo.add(linkTo(methodOn(PersonController.class).findById(id)).withSelfRel());
        return vo;
    }

    public PersonVO save(PersonVO personVO) {
        if (Objects.isNull(personVO)) throw new RequiredObjectIsNullException();

        if (Objects.nonNull(repository.findByDocument(personVO.getDocument()))) {
            throw new DataAlreadyExistsException("CPF já cadastrado.");
        }

        var entity = PersonMapper.toPerson(personVO);
        var vo = PersonMapper.toPersonVO(repository.save(entity));
        vo.add(linkTo(methodOn(PersonController.class).findById(vo.getId())).withSelfRel());
        return vo;
    }

    public PersonVO update(PersonVO personVO, Long id) {
        var entity = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pessoa não encontrada"));
        var vo = PersonMapper.toPersonVO(repository.save(entity));
        vo.add(linkTo(methodOn(PersonController.class).findById(personVO.getId())).withSelfRel());
        return vo;
    }

    @Transactional
    public PersonVO disablePerson(Long id) {
        repository.disablePerson(id);
        var entity = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pessoa não encontrada"));
        var vo = PersonMapper.toPersonVO(entity);
        vo.add(linkTo(methodOn(PersonController.class).findById(id)).withSelfRel());
        return vo;
    }

    public void delete(Long id) {
        var person = findById(id);
        repository.deleteById(person.getId());
    }

}
