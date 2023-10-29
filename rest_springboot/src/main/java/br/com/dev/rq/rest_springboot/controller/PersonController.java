package br.com.dev.rq.rest_springboot.controller;

import br.com.dev.rq.rest_springboot.data.dto.PersonDTO;
import br.com.dev.rq.rest_springboot.data.mapper.PersonMapper;
import br.com.dev.rq.rest_springboot.service.PersonService;
import br.com.dev.rq.rest_springboot.util.MediaType;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService service;

    private final PersonMapper mapper;

    @GetMapping(produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public ResponseEntity<List<PersonDTO>> findAll() {
        return ResponseEntity.ok(PersonMapper.toPersonDTOList(service.findAll()));
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public ResponseEntity<PersonDTO> findById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(PersonMapper.toPersonDto(service.findById(id)));
    }

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML},
            consumes = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(PersonMapper.toPersonDto(service.save(PersonMapper.toPerson(personDTO))));
    }

    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML},
            consumes = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_YML})
    public ResponseEntity<PersonDTO> update(@RequestBody final PersonDTO personDTO, @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(PersonMapper.toPersonDto(service.update(PersonMapper.toPerson(personDTO), id)));
    }

    @DeleteMapping(value = "/{id}")
    public Object delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent();
    }

}
